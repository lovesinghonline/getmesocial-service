package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Resource
@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping()
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    @PutMapping()
    public User updateUserById(@RequestBody User user){
        return userService. updateUserById(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam( name = "userId") String userId){
        userService.deleteUser(userId);
    }
    @GetMapping("/find")
    public List<User> getUserByName(@RequestParam(name ="name") String name)
    {return userService. getUserByName(name);
    }
}
