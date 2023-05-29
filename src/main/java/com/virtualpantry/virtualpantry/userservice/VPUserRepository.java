package com.virtualpantry.virtualpantry.userservice;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface VPUserRepository extends JpaRepository<VPUser, Long> {
    Optional<VPUser> findByEmail(String username);
}
