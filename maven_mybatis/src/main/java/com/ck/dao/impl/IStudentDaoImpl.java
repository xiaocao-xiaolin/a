package com.ck.dao.impl;

import com.ck.dao.IStudentDao;
import com.ck.entity.Student;
import com.ck.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
public class IStudentDaoImpl implements IStudentDao {
    @Override
    public List<Student> queryAll() {
        SqlSession sqlSession = MyBatisUtil.openSession(false);
        IStudentDao mapper = sqlSession.getMapper(IStudentDao.class);
        return mapper.queryAll();
    }
}
