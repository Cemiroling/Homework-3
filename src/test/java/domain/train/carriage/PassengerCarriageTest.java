package domain.train.carriage;

import domain.Ticket;
import domain.person.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class PassengerCarriageTest {

    private PassengerCarriage passengerCarriage;

    @BeforeEach
    public void before() {
        passengerCarriage = new PassengerCarriage(1, 12);
    }

    @Test
    void addPassengerValid() {
        Passenger passenger = new Passenger("test", "passenger", 20, new Ticket(0, 12));
        passengerCarriage.addPassenger(passenger);
        assertThat(passengerCarriage.getPassengers().get(0), equalTo(passenger));
    }

    @Test
    void addPassengerPlaceNotExist() {
        Passenger passenger = new Passenger("test", "passenger", 20, new Ticket(10, 12));
        Assertions.assertThrows(IllegalArgumentException.class, () -> passengerCarriage.addPassenger(passenger));
    }

    @Test
    void addPassengerWrongCarriage() {
        Passenger passenger = new Passenger("test", "passenger", 20, new Ticket(0, 1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> passengerCarriage.addPassenger(passenger));
    }

    @Test
    void addPassengerPlaceIsTaken() {
        Passenger passenger = new Passenger("test", "passenger", 20, new Ticket(0, 12));
        passengerCarriage.addPassenger(passenger);
        Assertions.assertThrows(IllegalArgumentException.class, () -> passengerCarriage.addPassenger(passenger));
    }
}