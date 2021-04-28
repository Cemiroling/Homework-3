package domain.train.carriage;

import domain.Cargo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;

@Slf4j
public class CargoCarriage extends Carriage {
    private List<Cargo> cargoList;
    private final int carryingCapacity;

    public CargoCarriage(int carryingCapacity, int number) {
        super(number);
        this.carryingCapacity = carryingCapacity;
        cargoList = new ArrayList<>();
    }

    public void addCargo(Cargo cargo) {
        checkArgument(getCurrentWeight() + cargo.getWeight() <= carryingCapacity, "Carriage is full");
        cargoList.add(cargo);
        log.info("Cargo with weight {} was added.", cargo.getWeight());
    }

    public int getCurrentWeight() {
        return cargoList.stream().mapToInt(Cargo::getWeight).sum();
    }

    public List<Cargo> getCargoList() {
        return List.copyOf(cargoList);
    }
}
