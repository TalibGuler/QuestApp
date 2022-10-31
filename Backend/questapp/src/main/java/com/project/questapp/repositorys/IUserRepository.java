package com.project.questapp.repositorys;

import com.project.questapp.entities.Post;
import com.project.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepository extends JpaRepository <User,Long> {

}
