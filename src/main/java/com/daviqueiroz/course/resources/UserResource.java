package com.daviqueiroz.course.resources;

import com.daviqueiroz.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll()
    {
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999","1245");
        return ResponseEntity.ok().body(u);
    }
}
