package com.project.questapp.controllers;

import com.project.questapp.entities.Comment;
import com.project.questapp.repositorys.ICommentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private ICommentRepository commentRepository;

    public CommentController(ICommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @GetMapping
    public List<Comment> getall(){
        return commentRepository.findAll();
    }

}
