package com.likelion.dao;

import com.likelion.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    void InsertAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("localUserDao",UserDao.class);

        User user = new User("10", "Jully", "1234");
        userDao.add(user);

        User selectedUser = userDao.get("10");
        Assertions.assertEquals("Jully", selectedUser.getName());
    }
}