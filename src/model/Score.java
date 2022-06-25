/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.text.DecimalFormat;
/**
 *
 * @author Abc
 */
public class Score {
    public static DecimalFormat SCORE_FORMAT = new DecimalFormat("###.##");
    private int id;
    private int studentId;
    private int classSubjectId;
    private int scoreTypetId;
    private double score;
    private Date date;

    public Score() {
    }

    public Score(int id, int studentId, int classSubjectId, int scoreTypetId, double score, Date date) {
        this.id = id;
        this.studentId = studentId;
        this.classSubjectId = classSubjectId;
        this.scoreTypetId = scoreTypetId;
        this.score = score;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassSubjectId() {
        return classSubjectId;
    }

    public void setClassSubjectId(int classSubjectId) {
        this.classSubjectId = classSubjectId;
    }

    public int getScoreTypetId() {
        return scoreTypetId;
    }

    public void setScoreTypetId(int scoreTypetId) {
        this.scoreTypetId = scoreTypetId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        SCORE_FORMAT.format(score);
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
