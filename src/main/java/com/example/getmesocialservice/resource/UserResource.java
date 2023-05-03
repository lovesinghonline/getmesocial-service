package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.exception.RestrictedIfoException;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Resource
@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws RestrictedIfoException {
        if(user.getName().equalsIgnoreCase("root"))
        {
            throw new RestrictedIfoException();
        }
        return userService.saveUser(user);
    }
    @GetMapping()
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }
    @PutMapping()
    public User updateUserById(@RequestBody @Valid User user) throws RestrictedIfoException {
        if(user.getName().equalsIgnoreCase("root"))
        {
            throw new RestrictedIfoException();
        }
        return userService. updateUserById(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam( name = "userId") String userId) throws RestrictedIfoException {
        if(userId.equalsIgnoreCase("root"))
        {
            throw new RestrictedIfoException();
        }
        userService.deleteUser(userId);
    }
    @GetMapping("/find")
    public List<User> getUserByName(@RequestParam(name ="name") String name) throws RestrictedIfoException {  if(name.equalsIgnoreCase("root"))
    {
        throw new RestrictedIfoException();
    }
        return userService. getUserByName(name);
    }

}
