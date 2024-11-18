package com.springrest.springrest.entities;

public class Course {

    int courseId;
    String courseName;
    String tenure;


    public Course(int courseId, String courseName, String tenure) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.tenure = tenure;
    }


    public int getCourseId() {
        return courseId;
    }


    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public String getTenure() {
        return tenure;
    }


    public void setTenure(String tenure) {
        this.tenure = tenure;
    }
    
    
    
}
