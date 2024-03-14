package course.student;

import java.util.ArrayList;
import java.util.List;
import course.course.Course;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Student ID: " + studentID);
    }

    public void getName(){
        System.out.println("Name: " + name);
    }

    public void enrollCourse(Course c) {
        coursesEnrolled.add(c);
        c.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Enrolled Courses:");
        for (Course c : coursesEnrolled) {
            System.out.println("- " + c.getCourseName());
        }
    }
}