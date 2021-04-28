package domain.train;

import domain.TestSamples;
import domain.train.carriage.CargoCarriage;
import domain.train.carriage.LocomotiveCarriage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class TrainTest {

    private Train train;

    @BeforeEach
    public void before() {
        train = new Train(1);
    }

    @Test
    void testAddCarriage() {
        LocomotiveCarriage locomotiveCarriage = TestSamples.locomotiveCarriage();
        CargoCarriage cargoCarriage = TestSamples.cargoCarriage();
        train.addCarriage(locomotiveCarriage);
        train.addCarriage(cargoCarriage);
        assertThat(train.getCarriageList().getHeadCarriage().getCarriage(), is(equalTo(locomotiveCarriage)));
        assertThat(train.getCarriageList().getHeadCarriage().getNextCarriage().getCarriage(), is(equalTo(cargoCarriage)));
    }

}