package com.example.shardingjdbc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shardingjdbc.bean.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
