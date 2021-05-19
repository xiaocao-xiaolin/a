package com.ck.service.impl;

import com.ck.dao.IBookInfoDao;
import com.ck.entity.BookInfo;
import com.ck.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBookInfoServiceImpl implements IBookInfoService {
    @Autowired
    private IBookInfoDao dao;
    @Override
    public List<BookInfo> queryAll() {
        return dao.queryAll();
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
