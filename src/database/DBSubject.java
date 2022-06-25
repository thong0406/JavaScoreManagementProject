/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Subjectes/Subject.java to edit this template
 */
package database;

import static database.DBConnection.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Subject;

/**
 *
 * @author Abc
 */
public class DBSubject {
    public ArrayList<Subject> GetSubject() {
        ArrayList<Subject> list = new ArrayList<Subject>();
        try {
            String sql = "SELECT * FROM `subject`";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Subject row = new Subject();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Subject> GetSubject(String id) {
        ArrayList<Subject> list = new ArrayList<Subject>();
        try {
            String sql = "SELECT * FROM `subject` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Subject row = new Subject();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<Subject> GetSubject(int limit, int offset) {
        ArrayList<Subject> list = new ArrayList<Subject>();
        try {
            String sql = "SELECT * FROM `subject` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Subject row = new Subject();
                row.setId(rs.getInt("id"));
                row.setName(rs.getString("name"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public boolean AddSubject(String name) {
        try {
            String sql = "INSERT INTO `subject`(`name`) VALUES (?);";
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
