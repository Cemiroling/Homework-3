package domain.train.carriage;

import lombok.Getter;

@Getter
public class Carriage {
    private final int number;

    public Carriage(int number) {
        this.number = number;
    }
}
