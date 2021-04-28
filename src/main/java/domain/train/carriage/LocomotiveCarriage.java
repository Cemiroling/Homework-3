package domain.train.carriage;

import domain.person.Driver;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import static com.google.common.base.Preconditions.checkArgument;

@Slf4j
@Getter
public class LocomotiveCarriage extends Carriage {
    private Driver driver;

    public LocomotiveCarriage(int number) {
        super(number);
    }

    public void setDriver(Driver driver) {
        checkDriver(driver);
        this.driver = driver;
    }

    public boolean checkDriver(Driver driver){
        checkArgument(driver.getAge() >= 18, "Drivers age cannot be below 18");
        checkArgument(driver.hasValidLicense(), "Drivers license is not valid");
        return true;
    }
}
