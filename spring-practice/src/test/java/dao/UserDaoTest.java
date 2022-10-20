package dao;

import domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insertAndSelectTest() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("localUserDao", UserDao.class);

        User user = new User("11", "Tom", "1234");
        userDao.insert(user);

        User selectedUser = userDao.select("11");
        Assertions.assertEquals("Tom", selectedUser.getName());
    }
}