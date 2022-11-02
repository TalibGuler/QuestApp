package com.project.questapp.controllers;

import com.project.questapp.entities.User;
import com.project.questapp.repositorys.IUserRepository;
import com.project.questapp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService=userService;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAllUSers();
    }

    @PostMapping
    public User createUser (@RequestBody User newUser){
        return userService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public User getOneUser (@PathVariable Long userId){
      return userService.getOneUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser){
      return userService.uptadeOneUser(userId,newUser);
    }

    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
         userService.deleteOneUser(userId);
    }


}
