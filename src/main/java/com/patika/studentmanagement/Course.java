package com.patika.studentmanagement;

public class Course {
    Lecturer courseLecturer;
    String name;
    String code;
    String prefix;
    int midtermGrade;
    int finalGrade;
    double averageGrade;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.midtermGrade = 0;
        this.finalGrade = 0;
        this.averageGrade = 0;
    }

    public void addLecturer(Lecturer l) {
        if (this.prefix.equals(l.field)) {
            this.courseLecturer = l;
            System.out.println("Successfully added.");
        } else {
            System.out.println(l.name + " cannot teach out of field.");
        }
    }

    public void printLecturer() {
        if (courseLecturer != null) {
            System.out.println(this.name + "Lecturer is "+courseLecturer.name);
        } else {
            System.out.println("No lecturer assigned to "+this.name);
        }
    }

    
}
