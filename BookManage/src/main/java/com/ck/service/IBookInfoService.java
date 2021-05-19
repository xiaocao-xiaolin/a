package com.ck.service;

import com.ck.entity.BookInfo;

import java.util.List;

public interface IBookInfoService {
    List<BookInfo> queryAll();
    void deleteById(int id);
}
