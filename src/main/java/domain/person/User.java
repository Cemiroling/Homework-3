package domain.person;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
}
