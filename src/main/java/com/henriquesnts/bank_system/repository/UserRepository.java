package com.henriquesnts.bank_system.repository;

import com.henriquesnts.bank_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, String> {

}
