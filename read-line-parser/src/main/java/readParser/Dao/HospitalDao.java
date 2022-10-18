package readParser.Dao;

import readParser.db_connection.ConnectionMaker;
import readParser.domain.Hospital;
import readParser.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalDao {
    public void add(Hospital hospital) throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String insertQuery = "INSERT INTO seoul_hospital(id, address, district, category, emergency_room, name, subdivision) VALUES (?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        ps.setString(1, hospital.getId());
        ps.setString(2, hospital.getAddress());
        ps.setString(3, hospital.getDistrict());
        ps.setString(4, hospital.getCategory());
        ps.setInt(5, hospital.getEmergencyRoom());
        ps.setString(6, hospital.getName());
        ps.setString(7, hospital.getSubdivision());

        ps.executeUpdate(); // insert 는 테이블에 영향을 주기 때문에 Update
        ps.close();
        conn.close();
        System.out.println("INSERT 성공");
    }

    public void get(Hospital hospital, String id) throws SQLException, ClassNotFoundException {
        ConnectionMaker cm = new ConnectionMaker();
        Connection conn = cm.makeConnection();

        String selectQuery = "SELECT * from seoul_hospital WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(selectQuery);
        ps.setString(1, hospital.getId());
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        rs.close();
        ps.close();
        conn.close();
        System.out.println("SELECT 성공");
    }
}
