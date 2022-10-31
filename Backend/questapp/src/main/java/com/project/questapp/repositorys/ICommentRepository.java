package com.project.questapp.repositorys;

import com.project.questapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepository extends JpaRepository <Comment,Long> {
}
