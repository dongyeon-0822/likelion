package com.likelion.dao;

import com.likelion.domain.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class UserDaoFactory {
    @Bean
    public UserDao localUserDao() {
        return new UserDao(localDataSource());
    }
    @Bean
    public UserDao awsUserDao() {
        return new UserDao(awsDataSource());
    }

    @Bean
    DataSource awsDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }
    @Bean
    DataSource localDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/likelion");
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword("DB_PASSWORD");
        return dataSource;
    }
}
