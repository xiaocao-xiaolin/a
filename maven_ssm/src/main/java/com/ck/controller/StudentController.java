package com.ck.controller;

import com.ck.entity.Student;
import com.ck.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private IStudentService service;

    @RequestMapping("query")
    public String query(ModelMap map){
        List<Student> query = service.query();
        map.put("query", query);
        return "index";
    }
}
