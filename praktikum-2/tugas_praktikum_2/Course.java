/* File: Course.java         01/03/24
 * Penulis: Ilham Rismawan Faadhi
 * NIM: 24060122140182
 * Deskripsi: Mendefinisikan kelas Course yang mencakup properti dan metode untuk merepresentasikan mata kuliah.
 */
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    // Enkapsulasi
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    // Methods
    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseCode + ":");
        for (Student student : studentsEnrolled) {
            System.out.println("- " + student.getName());
        }
    }
}
