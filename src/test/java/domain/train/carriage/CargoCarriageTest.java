package domain.train.carriage;

import domain.Cargo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CargoCarriageTest {
    private CargoCarriage cargoCarriage;

    @BeforeEach
    public void before() {
        cargoCarriage = new CargoCarriage(100, 12);
    }

    @Test
    void testAddCargoValid() {
        Cargo cargo = new Cargo(1, 50);
        cargoCarriage.addCargo(cargo);
        assertThat(cargoCarriage.getCargoList().get(0), is(equalTo(cargo)));
    }

    @Test
    void testAddCargoFullCarriage() {
        Cargo cargo = new Cargo(1, 120);
        Assertions.assertThrows(IllegalArgumentException.class, () -> cargoCarriage.addCargo(cargo));
    }

    @Test
    void testGetCurrentWeight() {
        Cargo cargo1 = new Cargo(1, 12);
        Cargo cargo2 = new Cargo(1, 38);
        cargoCarriage.addCargo(cargo1);
        cargoCarriage.addCargo(cargo2);
        assertThat(cargoCarriage.getCurrentWeight(), is(equalTo(cargo1.getWeight() + cargo2.getWeight())));
    }
}