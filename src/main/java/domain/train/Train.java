package domain.train;

import domain.train.carriage.Carriage;
import domain.train.carriage.CarriageList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Train {

    private final int number;
    private CarriageList carriageList;

    public Train(int number) {
        this.number = number;
        carriageList = new CarriageList();
    }

    public void addCarriage(Carriage carriage) {
        carriageList.addCarriage(carriage);
        log.info("{} was added", carriage.getClass().getSimpleName());
    }
}