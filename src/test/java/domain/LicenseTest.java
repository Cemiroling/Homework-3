package domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LicenseTest {
    @Test
    void testValidLicense() {
        License license = TestSamples.validLicense();
        assertThat(license.isValid(), is(true));
    }

    @Test
    void testInvalidLicense() {
        License license = TestSamples.invalidLicense();
        assertThat(license.isValid(), is(false));
    }
}