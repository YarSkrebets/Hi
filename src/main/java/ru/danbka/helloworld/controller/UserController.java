package ru.danbka.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.danbka.helloworld.controller.pojo.CreateUserParams;
import ru.danbka.helloworld.controller.pojo.UpdateStatusParams;
import ru.danbka.helloworld.controller.pojo.UpdateStatusResult;
import ru.danbka.helloworld.manager.UserService;
import ru.danbka.helloworld.model.User;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/1/2020: 3:56 PM
 */
@RestController
@RequestMapping("/user")
public abstract class UserController implements UserService {
    @Autowired
    UserService userService;


    @GetMapping("/get")
    public User getUser(@RequestParam(value = "id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping(value = "/create")
    public Long createUser(@RequestBody CreateUserParams params) {
        return userService.createUser(params.getUsername(), params.getEmail());
    }

    @PostMapping(value = "/status/update")
    public UpdateStatusResult updateStatus(@RequestBody UpdateStatusParams params) {
        return new UpdateStatusResult(params.getId(), userService.updateStatus(params.getId(), params.getStatus()), params.getStatus());
    }
}
