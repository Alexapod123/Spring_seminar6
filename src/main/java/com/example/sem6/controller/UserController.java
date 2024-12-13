package com.example.sem6.controller;

import com.example.sem6.model.User;
import com.example.sem6.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> user = service.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user, @PathVariable Long id){
        user.setId(id);
        return service.save(user);
    }

    @DeleteMapping("/id")
    public  void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
}
