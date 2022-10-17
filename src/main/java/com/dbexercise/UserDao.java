package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.*;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String insertQuery = "INSERT INTO user(id, name, password) VALUES(?,?,?);";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        ps.setString(1,"2");
        ps.setString(2, "dongyeon2");
        ps.setString(3, "1234");

        ps.executeUpdate(); // insert 는 테이블에 영향을 주기 때문에 Update
        ps.close();
        conn.close();
        System.out.println("INSERT 성공");
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String selectQuery = "SELECT * from user id=?;";
        PreparedStatement ps = conn.prepareStatement(selectQuery);
        ps.setString(1,id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString(1), rs.getString(2),rs.getString(3));

        rs.close();
        ps.close();
        conn.close();
        System.out.println("SELECT 성공");
        return user;
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
