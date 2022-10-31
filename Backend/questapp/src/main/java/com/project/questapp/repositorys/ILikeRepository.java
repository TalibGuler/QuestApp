package com.project.questapp.repositorys;

import com.project.questapp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepository extends JpaRepository <Like,Long> {
}
