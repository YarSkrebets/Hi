package ru.danbka.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import ru.danbka.helloworld.manager.UserManager;
import ru.danbka.helloworld.model.UserStatus;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/8/2020: 6:01 PM
 */
@SpringBootTest
public class UserManagerTest {
    @Autowired
    UserManager userManager;

    @Test
    public void mainQualityTest() {
        userManager.createUser("hi", "hi");
        Assert.isTrue(userManager.getUser(1L).isPresent(), "user not created");
        userManager.updateStatus(1L, UserStatus.OFFLINE);
        Assert.isTrue(userManager.getUser(1L).get().getStatus() == UserStatus.OFFLINE, "status not changed");
    }
}
