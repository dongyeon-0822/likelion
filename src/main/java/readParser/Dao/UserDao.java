package readParser.Dao;

import readParser.db_connection.ConnectionMaker;
import readParser.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<User> getAll() throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String selectQuery = "SELECT * from user WHERE;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(selectQuery);

        ArrayList<User> userList = new ArrayList<User>();

        while(rs.next()) {
            User user = new User();
            user.setId(rs.getString(1));
            user.setName(rs.getString(2));
            user.setPassword(rs.getString(3));
            userList.add(user);
        }
        rs.close();
        stmt.close();
        conn.close();
        System.out.println("SELECT All 성공");
        return userList;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
        userDao.get("1");
    }
}

