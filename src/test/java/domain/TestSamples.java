package domain;

import domain.person.Driver;
import domain.train.carriage.CargoCarriage;
import domain.train.carriage.LocomotiveCarriage;
import domain.train.carriage.PassengerCarriage;

import java.time.LocalDate;

public class TestSamples {
    public static Driver validDriver() {
        Driver driver = new Driver("test", "driver", 19, TestSamples.validLicense());
        return driver;
    }

    public static Driver underageDriver() {
        Driver driver = new Driver("test", "driver", 10, TestSamples.validLicense());
        return driver;
    }

    public static Driver unlicensedDriver() {
        Driver driver = new Driver("test", "driver", 19, TestSamples.invalidLicense());
        return driver;
    }

    public static License validLicense() {
        License license = new License(LocalDate.now().plusYears(1));
        return license;
    }

    public static License invalidLicense() {
        License license = new License(LocalDate.now().minusYears(1));
        return license;
    }

    public static CargoCarriage cargoCarriage() {
        CargoCarriage carriage = new CargoCarriage(100, 10);
        return carriage;
    }

    public static PassengerCarriage passengerCarriage() {
        PassengerCarriage carriage = new PassengerCarriage(100, 11);
        return carriage;
    }

    public static LocomotiveCarriage locomotiveCarriage() {
        LocomotiveCarriage carriage = new LocomotiveCarriage(12);
        return carriage;
    }
}
