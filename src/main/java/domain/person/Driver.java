package domain.person;

import domain.License;

public class Driver extends User {
    private final License license;

    public Driver(String firstName, String lastName, int age, License license) {
        super(firstName, lastName, age);
        this.license = license;
    }

    public boolean hasValidLicense() {
        return license.isValid();
    }
}