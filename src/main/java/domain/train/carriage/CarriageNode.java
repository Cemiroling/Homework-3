package domain.train.carriage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarriageNode {
    private Carriage carriage;
    private CarriageNode nextCarriage;

    CarriageNode(Carriage d) {
        carriage = d;
    }
}
