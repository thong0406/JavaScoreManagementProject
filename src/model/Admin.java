/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Abc
 */
public class Admin extends User {

    public Admin() {
    }

    public Admin(int id, String[] name, String username, String password) {
        super(id, name, username, password);
    }

    public Admin(int id, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, username, password);
    }

    public Admin(int id, String firstName, String lastName, String username, String password, String address, String email, String phone, Date dob) {
        super(id, firstName, lastName, username, password, address, email, phone, dob);
    }
    
}
