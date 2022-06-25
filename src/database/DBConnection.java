/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Abc
 */
public class DBConnection {
    protected static Connection conn;
    public DBConnection() {
        try{
            String dbURL = "jdbc:mysql://localhost:3306/score_management";
            conn = DriverManager.getConnection(dbURL,"root","");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}