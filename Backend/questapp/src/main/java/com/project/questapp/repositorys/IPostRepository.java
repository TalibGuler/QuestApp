package com.project.questapp.repositorys;

import com.project.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepository extends JpaRepository <Post,Long> {
    List<Post> findByUserId(Post userId);
}
