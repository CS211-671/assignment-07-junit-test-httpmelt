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

    @Test
    void testAddNewStudent3Parameters() {
        studentList.addNewStudent("66001", "La Luna", 75.0);
        Student student = studentList.findStudentById("66001");
        assertNotNull(student);
        assertEquals("La Luna", student.getName());
        assertEquals(75.0, student.getScore());
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("66001", "La Luna");
        studentList.giveScoreToId("66001", 70.0);
        Student student = studentList.findStudentById("66001");
        assertNotNull(student);
        assertEquals(70.0, student.getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("66001", "La Luna", 85.0);
        String grade = studentList.viewGradeOfId("66001");
        assertNotNull(grade);
        assertEquals("A", grade);
    }

    @Test
    void testFindStudentById() {
        studentList.addNewStudent("66001", "La Luna");
        Student student = studentList.findStudentById("66001");
        assertNotNull(student);
        assertEquals("La Luna", student.getName());
    }

    @Test
    void testGetStudents() {
        studentList.addNewStudent("66001", "La Luna");
        studentList.addNewStudent("66002", "El gato");
        assertEquals(2, studentList.getStudents().size());
    }


}