package ru.danbka.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.danbka.helloworld.controller.pojo.StatsParams;
import ru.danbka.helloworld.controller.pojo.StatsResult;
import ru.danbka.helloworld.manager.MiscService;
import ru.danbka.helloworld.model.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 5:45 PM
 */
@RestController
@RequestMapping("/misc")
public class MiscController {
    @Autowired
    private MiscService miscService;

    @PostMapping(value = "/stats")
    public StatsResult calculateStats(@RequestBody StatsParams params) {
        List<User> users = miscService.getStats(params.getStatus(), params.getTime());
        return new StatsResult(System.currentTimeMillis(),
                users.stream().map(User::getId).collect(Collectors.toList()));
    }
}
