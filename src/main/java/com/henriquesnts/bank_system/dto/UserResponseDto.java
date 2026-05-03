package com.henriquesnts.bank_system.dto;


import lombok.Data;

@Data
public class UserResponseDto {

    private String id;
    private String name;
    private String email;
    private String cpf;
}
