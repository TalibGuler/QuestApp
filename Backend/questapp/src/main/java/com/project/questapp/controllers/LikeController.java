package com.project.questapp.controllers;

import com.project.questapp.entities.Like;
import com.project.questapp.repositorys.ILikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikeController {

    @Autowired
    private ILikeRepository likeRepository;

    @GetMapping
    public List<Like> getAll(){
        return likeRepository.findAll();
    }

}
