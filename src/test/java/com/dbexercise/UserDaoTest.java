package com.dbexercise;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("5", "Jully", "1234");
        userDao.add(user);

        User selectedUser = userDao.get("8");
        Assertions.assertEquals("Jully", selectedUser.getName());
    }
}