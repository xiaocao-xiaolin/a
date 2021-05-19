package com.ck.entity;

public class Student {
    private Integer id;
    private String b_name;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", b_name='" + b_name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
