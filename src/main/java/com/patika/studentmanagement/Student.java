package com.patika.studentmanagement;

public class Student {

    String name, no;
    int classes;
    Course math;
    Course econ;
    Course csci;
    double average;
    boolean isPassed;

    Student( String name, String no, int classes, Course math, Course econ, Course csci) {
        this.name = name;
        this.no = no;
        this.classes = classes;
        this.math = math;
        this.econ = econ;
        this.csci = csci;
        calcAverage();
        this.isPassed = false;
    }

    public void addMidtermGrades(int math, int econ, int csci) {
        if (math >= 0 && math <= 100) {
            this.math.midtermGrade = math;
        }
        if (econ >= 0 && econ <= 100) {
            this.econ.midtermGrade = econ;
        }
        if (csci >=0 && csci <= 100) {
            this.csci.midtermGrade = csci;
        }
    }

    public void addFinalGrades(int math, int econ, int csci) {
        if (math >= 0 && math <= 100) {
            this.math.finalGrade = math;
        }
        if (econ >= 0 && econ <= 100) {
            this.econ.finalGrade = econ;
        }
        if (csci >=0 && csci <= 100) {
            this.csci.finalGrade = csci;
        }
    }

    public void isPassed() {
        calcAverage();
        if (this.math.averageGrade == 0 || this.econ.averageGrade == 0 || this.csci.averageGrade == 0) {
            System.out.println("Please enter course grades.");
        } else {
            this.isPassed = isCheckPass();
            printGrade();
            System.out.println("Average Grade: "+this.average);
            if (this.isPassed) {
                System.out.println("Passed.");
            } else {
                System.out.println("Failed.");
            }
        }
    }

    public void calcAverage() {
        this.math.averageGrade = (this.math.midtermGrade*0.20)+(this.math.finalGrade*0.80);
        this.econ.averageGrade = (this.econ.midtermGrade*0.20)+(this.econ.finalGrade*0.80);
        this.csci.averageGrade = (this.csci.midtermGrade*0.20)+(this.csci.finalGrade*0.80);
        this.average = (this.math.averageGrade+this.econ.averageGrade+this.csci.averageGrade) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printGrade() {
        System.out.println("--------------------------");
        System.out.println("Student: "+ this.name);
        System.out.println("Mathematics Grade: "+ this.math.averageGrade);
        System.out.println("Economics Grade: "+ this.econ.averageGrade);
        System.out.println("Computer Science Grade: "+ this.csci.averageGrade);
    }
    
}
