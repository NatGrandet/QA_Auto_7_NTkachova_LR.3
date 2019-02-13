package com.grandet.oop;

import com.grandet.oop.humans.Student;
import com.grandet.oop.humans.Teacher;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan Ivanow","+38671111111", 2000,
                001, "Odessa", "Student", "IT-6062", "IT",
                "Computer science", 1);

        Teacher teacher2 = new Teacher("Petro Petrov", "+380672222222", 1980,
        002, "Kiyv", "Professor", "Programming",10, 1500000);

        Teacher teacher3 = new Teacher("Alla Ivanova", "+380673333333", 1996,
                003, "Odessa", "Trainee", "History" );



        System.out.println(student1.contactInfo());

        System.out.println(teacher2.getFullName() + " Working experiance: " + teacher2.getExperianceYears() +
                " Salary: " + teacher2.getSalary() + " UAH");

        teacher2.setExperianceYears(15);

        System.out.println(teacher2.getFullName() + " Working experiance: " + teacher2.getExperianceYears() +
                " Salary: " + teacher2.getSalary() + " UAH");


    }

}
