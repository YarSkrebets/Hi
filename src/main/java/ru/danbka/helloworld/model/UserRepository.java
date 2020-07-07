package ru.danbka.helloworld.model;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/5/2020: 10:04 PM
 */
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUserByStatusEqualsAndLastChangeDateAfter(UserStatus status, Date lastChangeDate);
}
