package com.bachtt.bsportproject.services.impl;

import com.bachtt.bsportproject.models.user.Role;
import com.bachtt.bsportproject.models.user.RoleName;
import com.bachtt.bsportproject.repositories.IRoleRepository;
import com.bachtt.bsportproject.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return roleRepository.findByName(name);
    }
}
