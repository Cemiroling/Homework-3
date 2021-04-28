package domain.person;

import domain.TestSamples;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DriverTest {
    @Test
    void testValidDriverLicense() {
        Driver driver = TestSamples.validDriver();
        assertThat(driver.hasValidLicense(), is(true));
    }

    @Test
    void testInvalidDriverLicense() {
        Driver driver = TestSamples.unlicensedDriver();
        assertThat(driver.hasValidLicense(), is(false));
    }
}