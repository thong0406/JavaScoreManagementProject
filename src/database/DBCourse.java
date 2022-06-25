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
import model.Course;

/**
 *
 * @author Abc
 */
public class DBCourse {
    public ArrayList<Course> GetCourse() {
        ArrayList<Course> list = new ArrayList<Course>();
        try {
            String sql = "SELECT * FROM `course`";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Course row = new Course();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Course> GetCourse(String id) {
        ArrayList<Course> list = new ArrayList<Course>();
        try {
            String sql = "SELECT * FROM `course` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Course row = new Course();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Course> GetCourse(int limit, int offset) {
        ArrayList<Course> list = new ArrayList<Course>();
        try {
            String sql = "SELECT * FROM `course` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Course row = new Course();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public boolean AddCourse(String name) {
        try {
            String sql = "INSERT INTO `course`(`name`) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, name);
            
            int n = ps.executeUpdate();
            
            if (n > 0) return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
