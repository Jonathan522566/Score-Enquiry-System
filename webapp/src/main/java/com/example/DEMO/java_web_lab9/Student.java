package com.example.DEMO.java_web_lab9;

public class Student {
    private String stuNo;
    private String stuName;
    private int stuAge;
    public Student(){}
    public Student(String stuNo,String stuName,int stuAge){
        this.stuNo=stuNo;
        this.stuName=stuName;
        this.stuAge=stuAge;
    }
    public String getStuNo(){return stuNo;}
    public void setStuNo(String stuNo){this.stuNo=stuNo;}
    public String getStuName(){return stuName;}
    public void setStuName(String stuName){this.stuName=stuName;}
    public int getStuAge(){return stuAge;}
    public void setStuAge(int stuAge){this.stuAge=stuAge;}
    public String toString(){return "stuName:"+stuName+",stuNo:"+stuNo+",stuAge:"+stuAge;}
}
