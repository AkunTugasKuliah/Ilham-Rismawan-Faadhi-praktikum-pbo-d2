/* File: Student.java        01/03/24
 * Penulis: Ilham Rismawan Faadhi
 * NIM: 24060122140182
 * Deskripsi: Mendefinisikan kelas Student yang mencakup properti dan metode untuk merepresentasikan mahasiswa di Departemen Informatika. Propertinya dienkapsulasi, dan terdapat fungsi untuk mendaftar dan melihat mata kuliah yang diambil.
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    // Enkapsulasi
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentID() {
        return studentID;
    }

    // Methods
    public void getDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("\nName: " + name);
        System.out.println("\nAge: " + age);
        System.out.println("\nAddress: " + address);
        System.out.println("\nStudent ID: " + studentID);
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : coursesEnrolled) {
            System.out.println("- " + course.getCourseCode() + " - " + course.getCourseName());
        }
    }
}