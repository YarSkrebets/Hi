package ru.danbka.helloworld.manager;

import ru.danbka.helloworld.model.User;
import ru.danbka.helloworld.model.UserStatus;

import java.util.Date;
import java.util.List;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 5:43 PM
 */
public interface MiscManager {
    List<User> getStats(UserStatus status, Date startTime);
}
