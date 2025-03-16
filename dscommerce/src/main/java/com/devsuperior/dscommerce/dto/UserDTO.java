package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthday;

    private List<String> roles = new ArrayList<>();

    public UserDTO() {

    }
    public UserDTO(User entity) {
        name = entity.getName();
        email = entity.getEmail();
        phone = entity.getPhone();
        birthday = entity.getBirthday();
        for (GrantedAuthority role : entity.getRoles()) {
            roles.add(role.getAuthority());
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getRoles() {
        return roles;
    }
}
