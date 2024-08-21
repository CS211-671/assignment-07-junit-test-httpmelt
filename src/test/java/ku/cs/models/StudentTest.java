package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void init(){
        s1 = new Student("6610450358", "Jugo de naranja");
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 100 คะแนน")
    void testAddScore(){
        Student s1 = new Student("6610450358", "Jugo de naranja");
        assertEquals(0, s1.getScore());
        s1.addScore(100);
        assertEquals(100, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 60.8 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s1 = new Student("6610450358", "Jugo de naranja");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());

    }

    @Test
    @DisplayName("ทดสอบการตรวจสอบ ID")
    void testIsId(){
        Student s1 = new Student("6610450358", "Jugo de naranja");
        assertTrue(s1.isId("6610450358"));
    }

    @Test
    void testChangName(){
        Student s1 = new Student("6610450358", "Jugo de naranja");
        assertEquals("Jugo de naranja", s1.getName());
        s1.changeName("El gato");
        assertEquals("El gato", s1.getName());

    }

}