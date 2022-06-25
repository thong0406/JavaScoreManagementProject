/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import static database.DBConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author Abc
 */
public class DBStudent {
    public ArrayList<Student> GetStudent() {
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            String sql = "SELECT * FROM `student`";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Student row = new Student();
                row.setId(rs.getInt("id"));
                row.setClassId(rs.getInt("classId"));
                row.setName(rs.getString("firstName"), rs.getString("lastName"));
                row.setUsername(rs.getString("username"));
                row.setPassword(rs.getString("password"));
                row.setAddress(rs.getString("address"));
                row.setPhone(rs.getString("phone"));
                row.setDob(rs.getDate("dob"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Student> GetStudent(String id) {
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            String sql = "SELECT * FROM `student` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Student row = new Student();
                row.setId(rs.getInt("id"));
                row.setClassId(rs.getInt("classId"));
                row.setName(rs.getString("firstName"), rs.getString("lastName"));
                row.setUsername(rs.getString("username"));
                row.setPassword(rs.getString("password"));
                row.setAddress(rs.getString("address"));
                row.setPhone(rs.getString("phone"));
                row.setDob(rs.getDate("dob"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Student> GetStudent(int limit, int offset) {
        ArrayList<Student> list = new ArrayList<Student>();
        try {
            String sql = "SELECT * FROM `student` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Student row = new Student();
                row.setId(rs.getInt("id"));
                row.setClassId(rs.getInt("classId"));
                row.setName(rs.getString("firstName"), rs.getString("lastName"));
                row.setUsername(rs.getString("username"));
                row.setPassword(rs.getString("password"));
                row.setAddress(rs.getString("address"));
                row.setPhone(rs.getString("phone"));
                row.setDob(rs.getDate("dob"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public boolean AddStudent(int classId, String firstName, String lastName, String username, String password) {
        try {
            String sql = "INSERT INTO `student`(`username`, `password`, `firstName`, `lastName`, `classId`) VALUES (?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setInt(5, classId);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    public boolean AddStudent(int classId, String username, String password, String firstName, String lastName, String email, String phone, String address) {
        try {
            String sql = "INSERT INTO `student`(`username`, `password`, `firstName`, `lastName`, `email`, `phone`, `address`, `classId`) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, address);
            ps.setInt(8, classId);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
