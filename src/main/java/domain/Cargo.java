package domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Cargo {
    private final int number;
    private final int weight;
}
