package com.virtualpantry.virtualpantry.registration;

import com.virtualpantry.virtualpantry.userservice.VPUser;
import com.virtualpantry.virtualpantry.userservice.VPUserRole;
import com.virtualpantry.virtualpantry.userservice.VPUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRegistrationService {

    private final VPUserService vpUserService;
    private final EmailValidator emailValidator;

    public String register(UserRegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return vpUserService.signUpUser(
                new VPUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getUsername(),
                        request.getPhoneNumber(),
                        request.getEmail(),
                        request.getPassword(),
                        request.getHouseholdId(),
                        VPUserRole.USER
                )
        );
    }
}
