package domain.train.carriage;

import domain.TestSamples;
import domain.person.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LocomotiveCarriageTest {
    private LocomotiveCarriage locomotiveCarriage;

    @BeforeEach
    public void before() {
        locomotiveCarriage = new LocomotiveCarriage(1);
    }

    @Test
    void testCheckDriverUnderage() {
        Driver driver = TestSamples.underageDriver();
        Assertions.assertThrows(IllegalArgumentException.class, () -> locomotiveCarriage.checkDriver(driver));
    }

    @Test
    void testCheckDriverUnlicensed() {
        Driver driver = TestSamples.unlicensedDriver();
        Assertions.assertThrows(IllegalArgumentException.class, () -> locomotiveCarriage.checkDriver(driver));
    }

    @Test
    void testCheckDriverValid() {
        Driver driver = TestSamples.validDriver();
        assertThat(locomotiveCarriage.checkDriver(driver), is(true));
    }

    @Test
    void testSetDriverValid() {
        Driver driver = TestSamples.validDriver();
        locomotiveCarriage.setDriver(driver);
        assertThat(locomotiveCarriage.getDriver(), is(equalTo(driver)));
    }

    @Test
    void testSetDriverInvalid() {
        Driver driver = TestSamples.underageDriver();
        Assertions.assertThrows(IllegalArgumentException.class, () -> locomotiveCarriage.setDriver(driver));
    }
}