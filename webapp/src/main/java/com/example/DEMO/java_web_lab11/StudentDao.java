package com.example.DEMO.java_web_lab11;

public class StudentDao {
    private String stuNo;
    private String stuName;
    private int age;
    public String getStuNo(){return stuNo;}
    public void setStuNo(String stuNo){this.stuNo=stuNo;}
    public String getStuName(){return stuName;}
    public void setStuName(String stuName){this.stuName=stuName;}
    public int getStuAge(){return age;}
    public void setStuAge(int stuAge){this.age=stuAge;}
    public String toString(){return "stuName:"+stuName+",stuNo:"+stuNo+",stuAge:"+age;}
}
