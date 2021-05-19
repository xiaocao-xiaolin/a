package com.ck.dao;

import com.ck.entity.Student;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentDao {
    @Select("select * from student")
    @ResultMap("studentMapper")
    public List<Student> queryAll();
}
