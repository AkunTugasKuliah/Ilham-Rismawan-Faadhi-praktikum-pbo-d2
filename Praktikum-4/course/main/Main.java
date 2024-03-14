package course.main;

import course.course.*;
import course.lecture.*;
import course.student.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, "123 Main St", 1001);
        Student student2 = new Student("Jane", 21, "456 Elm St", 1002);

        Lecture lecture1 = new Lecture("Dr. Smith", 40, "789 Oak St", 2001);
        Lecture lecture2 = new Lecture("Prof. Johnson", 35, "101 Pine St", 2002);

        Course course1 = new Course("CSCI101", "Introduction to Computer Science");
        Course course2 = new Course("MATH101", "Calculus");

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        lecture1.teachCourse(course1);
        lecture2.teachCourse(course2);

        System.out.println("Student 1 Details:");
        student1.getDetails();
        System.out.println("Enrolled Courses:");
        student1.viewEnrolledCourses();

        System.out.println("\nStudent 2 Details:");
        student2.getDetails();
        System.out.println("Enrolled Courses:");
        student2.viewEnrolledCourses();

        System.out.println("\nLecture 1 Details:");
        lecture1.getDetails();
        System.out.println("Taught Courses:");
        lecture1.viewTaughtCourses();

        System.out.println("\nLecture 2 Details:");
        lecture2.getDetails();
        System.out.println("Taught Courses:");
        lecture2.viewTaughtCourses();

        System.out.println("\nCourse 1 Details:");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Enrolled Students:");
        course1.viewEnrolledStudents();

        System.out.println("\nCourse 2 Details:");
        System.out.println("Course Name: " + course2.getCourseName());
        System.out.println("Enrolled Students:");
        course2.viewEnrolledStudents();
    }
}
