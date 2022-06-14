package co.develhope.Database.MongoDB.controllers;

import co.develhope.Database.MongoDB.entities.User;
import co.develhope.Database.MongoDB.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping("")
    public List<User> getUserList(){
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userRepo.findById(id);
     }

     @PutMapping("/{id}")
    public User putUser(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        return userRepo.save(user);
     }

     @DeleteMapping("/{id}")
     public void deleteUser(@PathVariable String id){
        userRepo.deleteById(id);
     }

}
