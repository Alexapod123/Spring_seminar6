package com.example.sem6.service;

import com.example.sem6.repository.UserRepository;
import com.example.sem6.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public Optional<User> findById(Long id){
        return repository.findById(id);
    }

    public User save(User user){
        return repository.save(user);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
