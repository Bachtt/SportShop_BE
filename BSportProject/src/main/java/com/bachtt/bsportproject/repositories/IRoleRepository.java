package com.bachtt.bsportproject.repositories;

import com.bachtt.bsportproject.models.user.Role;
import com.bachtt.bsportproject.models.user.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
