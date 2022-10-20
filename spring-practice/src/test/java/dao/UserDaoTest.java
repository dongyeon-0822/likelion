package dao;

import domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
    @Autowired //한번만 생성 여러번 반복하지 않게 해준다.
    ApplicationContext context;

    private UserDao userDao;
    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    void setUp() {
        this.userDao = context.getBean("LocalUserDao",UserDao.class);
        this.user1 = new User("12", "Billy", "1234");
        this.user2 = new User("13", "sujin", "1234");
        this.user3 = new User("14", "sohyun", "1234");
    }

    @Test
    public void insertAndSelectTest() throws SQLException, ClassNotFoundException {
        UserDao userDao = context.getBean("localUserDao", UserDao.class);

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.insert(user1);

        User selectedUser = userDao.select("11");
        Assertions.assertEquals(user1.getName(), selectedUser.getName());
    }

    @Test
    void deleteAndCountTest() throws SQLException, ClassNotFoundException {
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

    @Test
    void selectExceptionTest() {
        assertThrows(EmptyResultDataAccessException.class, ()->{
            userDao.select("30");
        });
    }
}