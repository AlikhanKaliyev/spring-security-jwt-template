package kz.alikhan.securityproject.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
    private String confirmPassword;
    private String email;

}
