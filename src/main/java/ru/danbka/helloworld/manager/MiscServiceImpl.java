package ru.danbka.helloworld.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.danbka.helloworld.model.User;
import ru.danbka.helloworld.model.UserRepository;
import ru.danbka.helloworld.model.UserStatus;

import java.util.Date;
import java.util.List;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 5:44 PM
 */
@Service
public class MiscServiceImpl implements MiscService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getStats(UserStatus status, Date startTime) {
        return userRepository.findUserByStatusEqualsAndLastChangeDateAfter(status,
                startTime == null ? new Date(0) : startTime);
    }
}
