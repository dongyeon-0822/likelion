package dao;

import domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

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
        User user = null;
        if (rs.next()) {
            user = new User(rs.getString(1), rs.getString(2),rs.getString(3));
        }
        rs.close();
        ps.close();
        conn.close();
        System.out.println("SELECT 성공");

        if (user == null) throw new EmptyResultDataAccessException(1);

        return user;
    }
    public void deleteAll() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = c.makeConnection();
            ps = conn.prepareStatement("DELETE from user;");
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (c != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getCount() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            conn = c.makeConnection();
            ps = conn.prepareStatement("Select count(*) FROM user;");
            rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
            return count;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
