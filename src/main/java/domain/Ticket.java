package domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Ticket {
    final private int place;
    final private int carriage;
}
