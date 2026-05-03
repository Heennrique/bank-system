package com.henriquesnts.bank_system.repository;

import com.henriquesnts.bank_system.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, String> {
}
