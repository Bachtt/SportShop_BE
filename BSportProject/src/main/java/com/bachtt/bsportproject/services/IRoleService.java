package com.bachtt.bsportproject.services;

import com.bachtt.bsportproject.models.user.Role;
import com.bachtt.bsportproject.models.user.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
