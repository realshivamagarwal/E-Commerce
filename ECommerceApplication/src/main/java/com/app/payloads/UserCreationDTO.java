package com.app.payloads;

import com.app.entites.Role;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class UserCreationDTO {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String password;

    private Set<RoleDTO> roles = new HashSet<>();

    private Set<AddressDTO> addresses = new HashSet<>();
}
