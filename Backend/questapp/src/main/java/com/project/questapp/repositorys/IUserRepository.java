package com.project.questapp.repositorys;

import com.project.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User,Long> {
}
