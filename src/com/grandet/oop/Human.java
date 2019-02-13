package com.grandet.oop;

public class Human {

    private String fullName;
    private int dateOfBirth;
    private int id;
    private String phoneNumber;
    private String address;
    private String status;

    public Human() {}


    public Human(String fullName, String phoneNumber, int dateOfBirth, int id, String address, String status) {

        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.id = id;
        this.status = status;

    }


    public String contactInfo() {

        String contacts = "Full name: " + fullName + " Phone number: " + phoneNumber + " Address: " + address;
        return contacts;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}
