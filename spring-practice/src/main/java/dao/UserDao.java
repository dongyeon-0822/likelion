package dao;

import domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private ConnectionMaker c;

    public UserDao() {
    }

    public UserDao(ConnectionMaker c) {
        this.c = c;
    }

    public void insert(User user) throws SQLException, ClassNotFoundException {
        Connection conn = c.makeConnection();
        String insertQuery = "INSERT INTO user(id, name, password) VALUES(?,?,?);";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        conn.close();
        System.out.println("INSERT 성공");
    }

    public User select(String id) throws SQLException, ClassNotFoundException {
        Connection conn = c.makeConnection();

        String selectQuery = "SELECT * from user WHERE id=?;";
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
    public void deleteAll() throws SQLException, ClassNotFoundException {
        Connection conn = c.makeConnection();
        PreparedStatement ps = conn.prepareStatement("DELETE from user;");
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public int getCount() throws SQLException, ClassNotFoundException {
        Connection conn = c.makeConnection();
        PreparedStatement ps = conn.prepareStatement("Select count(*) FROM user;");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int count = rs.getInt(1);

        rs.close();
        ps.close();
        conn.close();
        return count;
    }
}
