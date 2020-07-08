package ru.danbka.helloworld.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.danbka.helloworld.model.User;
import ru.danbka.helloworld.model.UserRepository;
import ru.danbka.helloworld.model.UserStatus;

import java.util.Date;
import java.util.Optional;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 5:39 PM
 */
@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    UserRepository userRepository;


    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Long createUser(String username, String email) {
        return userRepository.save(new User(null, username, email, UserStatus.UNKNOWN, new Date(0))).getId();
    }

    @Override
    public UserStatus updateStatus(Long id, UserStatus status) {
        Optional<User> userById = userRepository.findById(id);
        if (userById.isPresent()) {
            User user = userById.get();
            UserStatus previous = user.getStatus();
            user.setStatus(status);
            user.setLastChangeDate(new Date());
            userRepository.save(user);
            return status;
        } else {
            throw new IllegalStateException("Unknown user.");
        }
    }
}
