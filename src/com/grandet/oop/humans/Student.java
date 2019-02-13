package com.grandet.oop.humans;

import com.grandet.oop.Human;

public class Student extends Human {
    private String groupId;
    private String faculty;
    private String specialisation;
    private int course;


    public Student(String fullName, String phoneNumber, int dateOfBirth,
                   int id, String address, String status, String groupId,
                   String faculty, String specialisation, int course) {
        super(fullName, phoneNumber, dateOfBirth, id, address, status);
        this.groupId = groupId;
        this.faculty = faculty;
        this.specialisation = specialisation;
        this.course = course;
    }

    @Override
    public String contactInfo() {
        return super.contactInfo();
    }

    //    Getters and Setters

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }






}
