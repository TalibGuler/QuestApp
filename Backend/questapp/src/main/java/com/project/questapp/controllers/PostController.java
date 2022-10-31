package com.project.questapp.controllers;

import com.project.questapp.entities.Post;
import com.project.questapp.repositorys.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostRepository postRepository;

    @GetMapping
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @PostMapping
    public Post addPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

}
