package me.christ9979.springoauth2demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
       return userService.findAll();
    }

    @PostMapping("/users")
    public void create(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable long id) {
        userService.delete(id);
        return "success";
    }


}
