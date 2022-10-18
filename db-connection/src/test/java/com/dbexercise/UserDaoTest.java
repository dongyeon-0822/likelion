package com.dbexercise;

import com.dbexercise.Dao.LocalUserDao;
import com.dbexercise.Dao.UserDao;
import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {
    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("6", "Jully", "1234");
        userDao.add(user);

        User selectedUser = userDao.get("6");
        Assertions.assertEquals("Jully", selectedUser.getName());
    }
}