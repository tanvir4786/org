package com.photoshoot.org.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photoshoot.org.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
