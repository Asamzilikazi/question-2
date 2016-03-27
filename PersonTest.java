package za.ac.mzilikazi;

/**
 * Created by mandisi on 2016-03-27.
 */
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Asavela on 2016-03-25.
 */
public class PersonTest {
    private Student student;
    private Employee employee;
    private Person person;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testStudent() throws Exception {
        Person person = new Person();
        Student student = new Student();

        Assert.assertSame(person.getIdNumber(),student.getStudentNumber());


    }

    @Test
    public void testEmployee() throws Exception {


        Person person = new Person();
        Employee employee = new Employee();

        Assert.assertNotSame(person.getIdNumber(),employee.getEmpNumber());


    }
}
