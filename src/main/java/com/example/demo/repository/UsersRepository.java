package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lukasz Dziedziak on 03.07.2017.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
}
