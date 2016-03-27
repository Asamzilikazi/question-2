package za.ac.mzilikazi;

/**
 * Created by mandisi on 2016-03-27.
 */
public class Student {
    String studentNumber;
    String course;

    public Student() {
    }

    public Student(String studentNumber, String course) {
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void occupation() {
        System.out.print("This is a student ");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
