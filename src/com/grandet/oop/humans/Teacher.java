package com.grandet.oop.humans;
import com.grandet.oop.Human;


public class Teacher extends Human {

    private String subject;
    private int experianceYears;
    private long salary;        //  Salary should be pointed in coins in order to avoid incorrect data manipulations


    public Teacher(String fullName, String phoneNumber, int dateOfBirth,
                   int id, String address, String status, String subject,
                   int experianceYears, long salary) {
        super(fullName, phoneNumber, dateOfBirth, id, address, status);
        this.subject = subject;
        this.experianceYears = experianceYears;
        this.salary = salary;
    }


    public Teacher(String fullName, String phoneNumber, int dateOfBirth,
                   int id, String address, String status, String subject) {
        super(fullName, phoneNumber, dateOfBirth, id, address, status);
        this.subject = subject;

    }


    @Override
    public String contactInfo() {
        return super.contactInfo();
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperianceYears() {
        return experianceYears;
    }

    public void setExperianceYears(int experianceYears) {
        this.experianceYears = experianceYears;
    }

    public double getSalary() {
        if (salary >= 15) {
        return (salary / 100f) * 1.2;
        } else {
            return salary / 100f;
        }
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }





}
