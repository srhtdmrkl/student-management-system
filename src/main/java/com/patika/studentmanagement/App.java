package com.patika.studentmanagement;


public class App 
{
    public static void main( String[] args )
    {
        Course math = new Course("Mathematics", "MATH101", "MATH");
        Course econ = new Course("Economics", "ECON101", "ECON");
        Course csci = new Course("Computer Science", "CSCI101", "CSCI");

        Lecturer l1 = new Lecturer("John Doe", "905500000000", "MATH");
        Lecturer l2 = new Lecturer("Jane Doe", "905500000000", "ECON");
        Lecturer l3 = new Lecturer("John Smith", "90550000000", "CSCI");

        math.addLecturer(l1);
        econ.addLecturer(l2);
        csci.addLecturer(l3);

        Student s1 = new Student("Peter Wegner", "2201", 3, math, econ, csci);
        s1.addMidtermGrades(60, 70, 60);
        s1.addFinalGrades(80, 80, 80);
        s1.isPassed();

        Student s2 = new Student("James Gosling", "2202", 3, math, econ, csci);
        s2.addMidtermGrades(70, 80, 80);
        s2.addFinalGrades(80, 0, 0);
        s2.isPassed();

        Student s3 = new Student("Brendan Eich", "2203", 3, math, econ, csci);
        s3.addMidtermGrades(60, 70, 60);
        s3.addFinalGrades(80, 80, 80);
        s3.isPassed();
    }
}
