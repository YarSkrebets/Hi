package ru.danbka.helloworld.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/5/2020: 10:04 PM
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
