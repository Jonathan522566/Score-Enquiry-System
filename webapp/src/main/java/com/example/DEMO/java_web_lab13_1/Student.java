package com.example.DEMO.java_web_lab13_1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String sNo;
    private String sName;
    private int age;
    private String[] languages;
    private List<String> favors;
    private Set s;
    private Map<String,Float> scores;



    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String sNo, String sName, int age) {
        super();
        this.sNo = sNo;
        this.sName = sName;
        this.age = age;
    }


    public void setsNo(String sNo) {
        this.sNo = sNo;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student [sNo=" + sNo + "," +
                " sName=" + sName + ", age=" + age + "]";
    }


    public void setMajor(String major) {

    }

    public void setStudentNumber(String sno) {
    }
}
