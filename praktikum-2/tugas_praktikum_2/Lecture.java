/* File: Lecture.java        01/03/24
 * Penulis: Ilham Rismawan Faadhi
 * NIM: 24060122140182
 * Deskripsi: Mendefinisikan kelas Lecture yang mencakup properti dan metode untuk merepresentasikan dosen.
 */
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
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

    public String getEmployeeID() {
        return employeeID;
    }

    // Methods
    public void getDetails() {
        System.out.println("\nLecture Details:");
        System.out.println("\nName: " + name);
        System.out.println("\nAge: " + age);
        System.out.println("\nAddress: " + address);
        System.out.println("\nEmployee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        course.getLecture(); 
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Course course : coursesTaught) {
            System.out.println("- " + course.getCourseCode() + " - " + course.getCourseName());
        }
    }
}
