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
import model.Teacher;

/**
 *
 * @author Abc
 */
public class DBTeacher {
    public ArrayList<Teacher> GetTeacher() {
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * FROM `teacher`";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Teacher row = new Teacher();
                row.setId(rs.getInt("id"));
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
    public ArrayList<Teacher> GetTeacher(String id) {
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * FROM `teacher` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Teacher row = new Teacher();
                row.setId(rs.getInt("id"));
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
    public ArrayList<Teacher> GetTeacher(int limit, int offset) {
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        try {
            String sql = "SELECT * FROM `teacher` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Teacher row = new Teacher();
                row.setId(rs.getInt("id"));
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
    public boolean AddTeacher(String firstName, String lastName, String username, String password) {
        try {
            String sql = "INSERT INTO `teacher`(`username`, `password`, `firstName`, `lastName`) VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    public boolean AddTeacher(String username, String password, String firstName, String lastName, String email, String phone, String address) {
        try {
            String sql = "INSERT INTO `teacher`(`username`, `password`, `firstName`, `lastName`, `email`, `phone`, `address`) VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setString(5, email);
            ps.setString(6, phone);
            ps.setString(7, address);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
