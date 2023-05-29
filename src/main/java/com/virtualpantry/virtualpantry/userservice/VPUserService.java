package com.virtualpantry.virtualpantry.userservice;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VPUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "User with email %s not found";
    private final VPUserRepository vpUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return vpUserRepository.findByEmail(email).orElseThrow(() ->
                        new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(VPUser vpUser) {
        boolean userExists = vpUserRepository
                .findByEmail(vpUser.getEmail())
                .isPresent();

        if (userExists) {
            throw new IllegalStateException("Account using this email already exists");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(vpUser.getPassword());
        vpUser.setPassword(encodedPassword);

        vpUserRepository.save(vpUser);

        //TODO: Send confirmation token

        return "it works";
    }
}
