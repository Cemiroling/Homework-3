package domain.train.carriage;

import domain.TestSamples;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class CarriageListTest {

    @Test
    void testAddCarriage() {
        CarriageList carriageList = new CarriageList();

        LocomotiveCarriage locomotiveCarriage = TestSamples.locomotiveCarriage();
        PassengerCarriage passengerCarriage = TestSamples.passengerCarriage();

        carriageList.addCarriage(locomotiveCarriage);
        carriageList.addCarriage(passengerCarriage);

        assertThat(carriageList.getHeadCarriage().getCarriage(), is(equalTo(locomotiveCarriage)));
        assertThat(carriageList.getHeadCarriage().getNextCarriage().getCarriage(), is(equalTo(passengerCarriage)));
    }

}