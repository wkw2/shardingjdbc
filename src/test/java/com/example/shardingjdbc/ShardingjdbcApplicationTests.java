package com.example.shardingjdbc;

import com.example.shardingjdbc.bean.Student;
import com.example.shardingjdbc.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ShardingjdbcApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void addStudent() {
        Student student = new Student();
        student.setName("文k");
        student.setAge(18);
        student.setCreate_time(new Date());
        student.setPhone("1008600");
        studentMapper.insert(student);
    }

}
