package course.course;

import java.util.ArrayList;
import java.util.List;
import course.student.Student;
import course.lecture.Lecture;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student s) {
        studentsEnrolled.add(s);
    }

    public void removeStudent(Student s) {
        studentsEnrolled.remove(s);
    }

    public void viewEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (Student s : studentsEnrolled) {
            System.out.println("- " + s.getClass());
        }
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public String getCourseName() {
        return courseName;
    }
}
