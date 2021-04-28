package domain;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class License {
    private final LocalDate dateOfExpiry;

    public boolean isValid() {
        return dateOfExpiry.isAfter(LocalDate.now());
    }
}
