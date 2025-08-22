package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    // @BeforeAll //เรียก testcase ทั้วหมด 1 รอบก่อน test method ชื่อ class ต้องมี static
    //@BeforeEach //check เเยกทีละ function เเละข้อมูล test ไม่ซ้อนกัน

    Student s;
    @BeforeEach
    void init() {
        s = new Student("67123456","test");
    }

    @Test
    @DisplayName("Test Add Score")
    void testAddScore(){
        //Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }


    @Test
    @DisplayName("Test Grade")
    void testCalculateGrade(){
        //Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(60);
        assertEquals("C", s.grade());
    }

    @Test
    @DisplayName("Test Contain Name")
    void testNameContains(){
        //Student s = new Student("6xxxxxxxx", "Skibidi");
        String newName = "LungTle";
        s.changeName(newName);
        assertEquals(true, s.isNameContains("LungTle"));
    }

    @Test
    @DisplayName("Test Contain Id")
    void testIdContains(){
        //Student s = new Student("67123456", "Skibidi");
        assertEquals(true, s.isId("67123456"));
    }

}