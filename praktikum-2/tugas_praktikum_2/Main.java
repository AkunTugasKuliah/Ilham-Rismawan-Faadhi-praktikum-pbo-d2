/* File: Main.java           01/03/24
 * Penulis: Ilham Rismawan Faadhi
 * NIM: 24060122140182
 * Deskripsi: Program utama (driver) yang menciptakan instance dari kelas Course, Student, dan Lecture untuk menunjukkan interaksi antar mereka.
 */
public class Main {
    public static void main(String[] args) {
        Lecture lecture1 = new Lecture("Dr. Smith", 40, "123 Main St", "EMP001");
        Student student1 = new Student("John Doe", 20, "456 Oak St", "STU001");
        Course course1 = new Course("CS101", "Introduction to Computer Science", lecture1);
        
        student1.getDetails();
        student1.enrollCourse(course1);
        student1.viewEnrolledCourses();

        lecture1.getDetails();
        lecture1.teachCourse(course1);
        lecture1.viewTaughtCourses();

        course1.viewEnrolledStudents();
    }
}
