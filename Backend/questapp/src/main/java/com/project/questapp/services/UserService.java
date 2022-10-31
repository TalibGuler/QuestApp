package com.project.questapp.services;

import com.project.questapp.entities.User;
import com.project.questapp.repositorys.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private IUserRepository userRepository;

    public UserService (IUserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<User> getAllUSers() {
        return userRepository.findAll();
    }

    public User saveOneUser(User newUser) {
        return userRepository.save(newUser);
    }
    public User getOneUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User uptadeOneUser(Long userId, User newUser) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()){
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }else
            return null;
    }

    public void deleteOneUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
