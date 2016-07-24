package com.example.pc.test;

/**
 * Created by Addaui on 7/21/2016.
 */
public class Subject {
    int hours;
    String Grade;

    public Subject(){
       this(0,"A+");
    }

    public Subject(int hours, String grade) {
        this.hours = hours;
        Grade = grade;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}
