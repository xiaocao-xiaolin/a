package com.ck.controller;

import com.ck.entity.BookInfo;
import com.ck.service.IBookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookInfoController {
    @Autowired
    private IBookInfoService service;
    @RequestMapping("queryAll")
    public String queryAll(ModelMap map){
        List<BookInfo> bookInfos = service.queryAll();
        map.put("bookInfos",bookInfos);
        return "p_list";
    }
    @RequestMapping("deleteById")
    @ResponseBody
    public String delete(@RequestParam int id){
        try {
            service.deleteById(id);
        }catch (Exception ex){
            return "0";
        }
        return "1";
    }
}
