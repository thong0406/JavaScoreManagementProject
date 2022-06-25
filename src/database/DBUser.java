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
import model.User;

/**
 *
 * @author Abc
 */
public class DBUser extends DBConnection {
    public DBUser() {}
    public ArrayList<User> GetUser(String table_name) {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM `" + table_name + "`;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                User row = new User();
                row.setId(rs.getInt("id"));
                row.setUsername(rs.getString("username"));
                row.setPassword(rs.getString("password"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public ArrayList<User> GetUser(String table_name, int id) {
        ArrayList<User> list = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM `" + table_name + "` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                User row = new User();
                row.setId(rs.getInt("id"));
                row.setUsername(rs.getString("username"));
                row.setPassword(rs.getString("password"));
                
                list.add(row);
            } 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return list;
    }
    public User GetUser(String table_name, String username, String password) {
        User user_data = null;
        try {
            String sql = "SELECT * FROM `" + table_name + "` WHERE `username`=? AND `password`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            user_data = new User();
            user_data.setId(rs.getInt("id"));
            user_data.setUsername(rs.getString("username"));
            user_data.setPassword(rs.getString("password"));
            return user_data;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return user_data;
    }
    public User GetUser(String table_name, int limit, int offset) {
        User user_data = null;
        try {
            String sql = "SELECT * FROM `" + table_name + "` LIMIT ? OFFSET ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, limit);
            ps.setInt(2, offset);
            
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            user_data = new User();
            user_data.setId(rs.getInt("id"));
            user_data.setUsername(rs.getString("username"));
            user_data.setPassword(rs.getString("password"));
            return user_data;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return user_data;
    }
    public int GetMaxUser(String table_name) {
        int id = 0;
        try {
            String sql = "SELECT MAX(`id`) AS `id` FROM `" + table_name + "`;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            return rs.getInt("id"); 
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return id;
    }
    public boolean AddUser(String table_name, String firstName, String lastName, String username, String password) {
        try {
            String sql = "INSERT INTO `" + table_name + "`(`username`, `password`, `firstName`, `lastName`) VALUES (?,?,?,?);";
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
    public boolean AddUser(String table_name, String username, String password, String firstName, String lastName, String email, String phone, String address) {
        try {
            String sql = "INSERT INTO `" + table_name + "`(`username`, `password`, `firstName`, `lastName`, `email`, `phone`, `address`) VALUES (?,?,?,?,?,?,?);";
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
    public boolean UpdateUser(String table_name, int id, String username, String password) {
        try {
            String sql = "UPDATE `" + table_name + "` SET `username`=?, `password`=? WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setInt(3, id);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    public boolean DeleteUser(String table_name, int id) {
        try {
            String sql = "DELETE FROM `" + table_name + "` WHERE `id`=?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int n = ps.executeUpdate();
            
            return (n > 0);
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
}
