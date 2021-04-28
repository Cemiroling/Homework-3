package domain.train.carriage;

import lombok.Getter;

import java.util.Objects;

@Getter
public class CarriageList {
    private CarriageNode headCarriage;

    public void addCarriage(Carriage carriage) {
        CarriageNode newCarriage = new CarriageNode(carriage);
        newCarriage.setNextCarriage(null);

        if (Objects.isNull(headCarriage)) {
            headCarriage = newCarriage;
        } else {
            CarriageNode last = headCarriage;
            while (!Objects.isNull(last.getNextCarriage())) {
                last = last.getNextCarriage();
            }
            last.setNextCarriage(newCarriage);
        }
    }
}