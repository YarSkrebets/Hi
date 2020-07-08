package ru.danbka.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.danbka.helloworld.controller.pojo.CreateUserParams;
import ru.danbka.helloworld.controller.pojo.UpdateStatusParams;
import ru.danbka.helloworld.controller.pojo.UpdateStatusResult;
import ru.danbka.helloworld.manager.UserManager;
import ru.danbka.helloworld.model.User;

import java.util.Optional;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/1/2020: 3:56 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserManager userManager;


    @GetMapping("/get")
    public Optional<User> getUser(@RequestParam(value = "id") Long id) {
        return userManager.getUser(id);
    }

    @PostMapping(value = "/create")
    public Long createUser(@RequestBody CreateUserParams params) {
        return userManager.createUser(params.getUsername(), params.getEmail());
    }

    @PostMapping(value = "/status/update")
    public UpdateStatusResult updateStatus(@RequestBody UpdateStatusParams params) {
        return new UpdateStatusResult(params.getId(), userManager.updateStatus(params.getId(), params.getStatus()), params.getStatus());
    }
}
