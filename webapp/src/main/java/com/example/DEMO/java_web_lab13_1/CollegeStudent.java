package com.example.DEMO.java_web_lab13_1;

public class CollegeStudent extends Student {
    private String major;
    private String sNo;
    private String sName;

   public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public String toString() {
        return "CollegeStudent [major=" + major + "," +
                " sNo=" + sNo + ", sName=" + sName + "]";
    }



}
