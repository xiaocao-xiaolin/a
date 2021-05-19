package com.ck.dao;

import com.ck.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentDao {
    @Select("select * from student")
    List<Student> query();
}
