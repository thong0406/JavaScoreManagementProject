/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Abc
 */
public class ClassSubject {
    private int Id;
    private int classId;
    private int subjectId;
    private int teacherId;

    public ClassSubject() {
    }

    public ClassSubject(int Id, int classId, int subjectId, int teacherId) {
        this.Id = Id;
        this.classId = classId;
        this.subjectId = subjectId;
        this.teacherId = teacherId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    
    
}
