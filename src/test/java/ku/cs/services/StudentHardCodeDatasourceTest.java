package ku.cs.services;

import org.junit.jupiter.api.BeforeEach;
import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    StudentHardCodeDatasource datasource;
    @BeforeEach
    void init() {
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    @DisplayName("Check Arr Size")
    void CheckArrSize() {
        //datasource.readData();
        //assertEquals(4,datasource.size());
    }


}