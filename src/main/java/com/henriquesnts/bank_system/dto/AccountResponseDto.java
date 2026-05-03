package com.henriquesnts.bank_system.dto;

import jakarta.persistence.Id;

public record AccountResponseDto (
        int accountNumber,
        int agency,
        String userId
        ){}