package com.ck.service.impl;

import com.ck.dao.IStudentDao;
import com.ck.entity.Student;
import com.ck.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IStudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao dao;
    @Override
    public List<Student> queryAll() {
        return dao.queryAll();
    }
}
