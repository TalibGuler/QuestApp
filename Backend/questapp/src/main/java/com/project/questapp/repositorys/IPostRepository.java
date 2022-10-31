package com.project.questapp.repositorys;

import com.project.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepository extends JpaRepository <Post,Long> {
}
