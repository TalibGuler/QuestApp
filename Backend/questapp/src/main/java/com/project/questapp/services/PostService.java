package com.project.questapp.services;

import com.project.questapp.entities.Post;
import com.project.questapp.entities.User;
import com.project.questapp.repositorys.IPostRepository;
import com.project.questapp.requests.PostCreateRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private IPostRepository postRepository;
    private UserService userService;

    public PostService(IPostRepository postRepository, UserService userService){
        this.postRepository=postRepository;
        this.userService = userService;
    }

    public List<Post> getAllPosts(Optional<Post> userId) {
        if(userId.isPresent()){
            return postRepository.findByUserId(userId.get());
        }else {
            return postRepository.findAll();
        }
    }

    public Post getOnePostById(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    public Post createOnePost(PostCreateRequest newPostRequest) {
        User user = userService.getOneUser(newPostRequest.getUserId());
        if (user == null){
            return null;
        }else {
            Post toSave = new Post();
            toSave.setId(newPostRequest.getId());
            toSave.setText(newPostRequest.getText());
            toSave.setTitle(newPostRequest.getTitle());
            toSave.setUser(user);
            return postRepository.save(toSave);
        }

    }
}
