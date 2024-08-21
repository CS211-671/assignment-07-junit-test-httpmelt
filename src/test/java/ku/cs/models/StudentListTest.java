package ku.cs.models;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent2Parameters() {
        studentList.addNewStudent("66001", "La Luna");
        Student student = studentList.findStudentById("66001");
        assertNotNull(student);
        assertEquals("La Luna", student.getName());
    }



}