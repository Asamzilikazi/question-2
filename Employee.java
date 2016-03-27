package za.ac.mzilikazi;

/**
 * Created by mandisi on 2016-03-27.
 */
public class Employee {
    private int empNumber;
    private String department;

    public Employee() {
    }

    public Employee(int empNumber, String department) {
        this.empNumber = empNumber;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void occupation() {

        System.out.print("This is an employee");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", department='" + department + '\'' +
                '}';
    }
}
