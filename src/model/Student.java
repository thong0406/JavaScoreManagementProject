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
public class Student extends User {
    private int classId;

    public Student() {
    }

    public Student(int id, int classId, String[] name, String username, String password) {
        super(id, name, username, password);
        this.classId = classId;
    }

    public Student(int id, int classId, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, username, password);
        this.classId = classId;
    }

    public Student(int id, int classId, String firstName, String lastName, String username, String password, String address, String email, String phone, Date dob) {
        super(id, firstName, lastName, username, password, address, email, phone, dob);
        this.classId = classId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
    
}
