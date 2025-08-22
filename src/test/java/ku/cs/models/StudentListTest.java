package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList stdList;

    @BeforeEach
    void init() {
        stdList = new StudentList();
        stdList.addNewStudent("67123456","SomSri",50);
        stdList.addNewStudent("67789101","Tle");
        stdList.addNewStudent("67124578","Tung",80);
    }

    @Test
    @DisplayName("Find id is real")
    void findStudentById() {
        assertEquals(stdList.getStudents().get(0),stdList.findStudentById("67123456"));
    }

    @Test
    @DisplayName("Filter Name")
    void filterByName() {
        assertEquals("Tle",stdList.filterByName("Tle").getStudents().get(0).getName());
    }

    @Test
    @DisplayName("View Student Grade with id")
    void viewGradeOfId() {
        stdList.giveScoreToId("67124578",10);
        assertEquals("A",stdList.viewGradeOfId("67124578"));
    }




}