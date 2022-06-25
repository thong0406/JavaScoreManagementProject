/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Abc
 */
public class Class {
    private int id;
    private int courseId;
    private int HTeacherId;
    private String name;

    public Class() {
    }

    public Class(int id, int courseId, int HTeacherId, String name) {
        this.id = id;
        this.courseId = courseId;
        this.HTeacherId = HTeacherId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getHTeacherId() {
        return HTeacherId;
    }

    public void setHTeacherId(int HTeacherId) {
        this.HTeacherId = HTeacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
