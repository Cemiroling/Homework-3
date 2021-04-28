import domain.Cargo;
import domain.License;
import domain.Ticket;
import domain.train.Train;
import domain.train.carriage.CargoCarriage;
import domain.train.carriage.LocomotiveCarriage;
import domain.train.carriage.PassengerCarriage;
import domain.person.Driver;
import domain.person.Passenger;

import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

        PassengerCarriage passengerCarriage = new PassengerCarriage(100, 3);
        Passenger passenger1 = new Passenger("first", "", 15, new Ticket(1, 3));
        Passenger passenger2 = new Passenger("second", "", 16, new Ticket(4, 3));
        Passenger passenger3 = new Passenger("third", "", 17, new Ticket(99, 3));
        passengerCarriage.addPassenger(passenger1);
        passengerCarriage.addPassenger(passenger2);
        passengerCarriage.addPassenger(passenger3);

        CargoCarriage cargoCarriage = new CargoCarriage(150, 2);
        Cargo cargo1 = new Cargo(1, 100);
        Cargo cargo2 = new Cargo(2, 10);
        Cargo cargo3 = new Cargo(3, 40);
        cargoCarriage.addCargo(cargo1);
        cargoCarriage.addCargo(cargo2);
        cargoCarriage.addCargo(cargo3);

        LocomotiveCarriage locomotiveCarriage = new LocomotiveCarriage(1);
        locomotiveCarriage.setDriver(new Driver("dd",
                "dd",
                19, new License(LocalDate.now().plusWeeks(1))));

        Train train = new Train(1);
        train.addCarriage(locomotiveCarriage);
        train.addCarriage(passengerCarriage);
        train.addCarriage(cargoCarriage);

    }
}
