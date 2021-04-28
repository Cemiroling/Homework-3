package domain.train.carriage;

import domain.person.Passenger;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

import static com.google.common.base.Preconditions.checkArgument;

@Slf4j
@Getter
public class PassengerCarriage extends Carriage {
    private final int numOfPassengers;
    private List<Passenger> passengers;

    public PassengerCarriage(int numOfPassengers, int number) {
        super(number);
        this.numOfPassengers = numOfPassengers;
        passengers = Arrays.asList(new Passenger[numOfPassengers]);
    }

    public void addPassenger(Passenger passenger) {
        int placeNumber = passenger.getTicket().getPlace();

        checkArgument(passenger.getTicket().getCarriage() == this.getNumber(),
                "Passenger doesn't have ticket for this carriage");
        checkArgument(placeNumber < numOfPassengers, "Carriage doesn't have such train seat");
        checkArgument(Objects.isNull(passengers.get(placeNumber)), "Train seat already taken");

        passengers.set(placeNumber, passenger);
        log.info("Passenger with ticket on {} train seat was added to the carriage {}", placeNumber, this.getNumber());
    }

    public List<Passenger> getPassengers() {
        return List.copyOf(passengers);
    }
}
