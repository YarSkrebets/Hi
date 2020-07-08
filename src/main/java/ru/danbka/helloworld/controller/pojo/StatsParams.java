package ru.danbka.helloworld.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.danbka.helloworld.model.UserStatus;

import java.util.Date;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/7/2020: 5:31 PM
 */
@AllArgsConstructor
@Getter
public class StatsParams {
    private UserStatus status;
    private Date time;
}
