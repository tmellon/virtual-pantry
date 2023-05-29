package com.virtualpantry.virtualpantry.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class UserRegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String password;
    private final String phoneNumber;
    private final String email;
    private final String householdId;

}
