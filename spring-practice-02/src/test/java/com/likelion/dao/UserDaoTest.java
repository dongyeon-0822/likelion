package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    private UserDao userDao;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    void serUp() {
        this.userDao = context.getBean("localuserDao", UserDao.class);
        this.user1 = new User("12", "Billy", "1234");
        this.user2 = new User("13", "sujin", "1234");
        this.user3 = new User("14", "sohyun", "1234");
    }

    @Test
    void addAndGet() {
        userDao.deleteAll();
        userDao.add(user1);
        User user = userDao.findById(user1.getId());

        assertEquals(user1.getName(), user.getName());
        assertEquals(user1.getPassword(), user.getPassword());
    }

}