package com.gigplatform.user_service;

import com.gigplatform.user_service.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
