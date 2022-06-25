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
import model.Class;

/**
 *
 * @author Abc
 */
public class DBClass {
    public ArrayList<Class> GetClass() {
        ArrayList<Class> list = new ArrayList<Class>();
        try {
            String sql = "SELECT * FROM `class`";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Class row = new Class();
                row.setId(rs.getInt("id"));
                row.setHTeacherId(rs.getInt("HTeacherId"));
                row.setCourseId(rs.getInt("courseId"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Class> GetClass(String id) {
        ArrayList<Class> list = new ArrayList<Class>();
        try {
            String sql = "SELECT * FROM `class` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Class row = new Class();
                row.setId(rs.getInt("id"));
                row.setHTeacherId(rs.getInt("HTeacherId"));
                row.setCourseId(rs.getInt("courseId"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Class> GetClass(int limit, int offset) {
        ArrayList<Class> list = new ArrayList<Class>();
        try {
            String sql = "SELECT * FROM `class` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Class row = new Class();
                row.setId(rs.getInt("id"));
                row.setHTeacherId(rs.getInt("HTeacherId"));
                row.setCourseId(rs.getInt("courseId"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public boolean AddClass(String name , int classId , int HTeacherId) {
        try {
            String sql = "INSERT INTO `class`(`classId` , `HTeacherId` , `name`) VALUES (?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, classId);
            ps.setInt(2, HTeacherId);
            ps.setString(3, name);
            
            int n = ps.executeUpdate();
            
            if (n > 0) return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
