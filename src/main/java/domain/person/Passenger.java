package domain.person;

import domain.Ticket;
import lombok.Getter;

@Getter
public class Passenger extends User {
    private final Ticket ticket;

    public Passenger(String firstName, String lastName, int age, Ticket ticket) {
        super(firstName, lastName, age);
        this.ticket = ticket;
    }
}
