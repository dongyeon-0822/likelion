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

        // delete, getCount
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        User user = new User("11", "Tom", "1234");
        userDao.insert(user);

        User selectedUser = userDao.select("11");
        Assertions.assertEquals(user.getName(), selectedUser.getName());
    }

    @Test
    void count() throws SQLException, ClassNotFoundException {
        User user1 = new User("12", "Billy", "1234");
        User user2 = new User("13", "sujin", "1234");
        User user3 = new User("14", "sohyun", "1234");

        UserDao userDao = context.getBean("localUserDao", UserDao.class);
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.insert(user1);
        assertEquals(1, userDao.getCount());
        userDao.insert(user2);
        assertEquals(2, userDao.getCount());
        userDao.insert(user3);
        assertEquals(3, userDao.getCount());
    }
}