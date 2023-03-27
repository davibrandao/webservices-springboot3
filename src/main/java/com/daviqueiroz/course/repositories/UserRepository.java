package com.daviqueiroz.course.repositories;

import com.daviqueiroz.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
