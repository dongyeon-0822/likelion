package com.likelion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 조립을 해준다.
@Configuration //Spring 적용 시작
public class UserDaoFactory {
    @Bean //Spring
    public UserDao awsUserDao() {
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }
    @Bean //Spring
    public UserDao localUserDao() {
        LocalConnectionMaker localConnectionMaker = new LocalConnectionMaker();
        UserDao userDao = new UserDao(localConnectionMaker);
        return userDao;
    }
}
