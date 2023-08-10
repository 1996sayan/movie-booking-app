package com.movie.user.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.user.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}