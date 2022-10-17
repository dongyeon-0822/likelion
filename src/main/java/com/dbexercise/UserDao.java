package com.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String insertQuery = "INSERT INTO user INTO (?,?,?);";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        ps.setString(1,"2");
        ps.setString(2, "dongyeon2");
        ps.setString(3, "1234");

        ps.executeUpdate(); // insert 는 테이블에 영향을 주기 때문에 Update
        ps.close();
        conn.close();
        System.out.println("INSERT 성공");
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
