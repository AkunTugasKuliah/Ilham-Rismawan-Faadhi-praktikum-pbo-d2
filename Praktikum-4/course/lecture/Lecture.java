package course.lecture;

import java.util.ArrayList;
import java.util.List;
import course.course.Course;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course c) {
        coursesTaught.add(c);
        c.setLecture(this);
    }

    public void viewTaughtCourses() {
        System.out.println("Taught Courses:");
        for (Course c : coursesTaught) {
            System.out.println("- " + c.getCourseName());
        }
    }
}