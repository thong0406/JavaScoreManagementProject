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
public class User {
    protected int id;
    protected String[] name  = {};
    protected String username;
    protected String password;
    protected String address = null;
    protected String email   = null;
    protected String phone   = null;
    protected Date dob       = null;

    public User() {}
    
    public User(int id, String[] name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.name[0] = firstName;
        this.name[1] = lastName;
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String firstName, String lastName, String username, String password , String address , String email , String phone , Date dob) {
        this.id = id;
        this.name[0] = firstName;
        this.name[1] = lastName;
        this.username = username;
        this.password = password;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name[0] = firstName;
        this.name[1] = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
}
