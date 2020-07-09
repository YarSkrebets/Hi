package ru.danbka.helloworld.manager;

import ru.danbka.helloworld.model.User;
import ru.danbka.helloworld.model.UserStatus;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 5:42 PM
 */
public interface UserService {
    User getUser(Long id);

    Long createUser(String username, String email);


    /**
     * return new status.
     */
    UserStatus updateStatus(Long id, UserStatus status);
}
