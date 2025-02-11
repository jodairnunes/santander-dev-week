package com.dio.domain.repository;

import com.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposirory extends JpaRepository<User, Long> {
}
