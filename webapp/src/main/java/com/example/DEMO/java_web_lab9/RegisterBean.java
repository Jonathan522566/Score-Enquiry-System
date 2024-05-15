package com.example.DEMO.java_web_lab9;

import java.io.Serializable;
import java.util.Vector;

public class RegisterBean implements Serializable {
    private static final long serialVersionID=1L;
    private String user;
    private String pass;
    private String realname;
    private String gender;
    private String[] chanel;
    public RegisterBean(){}
    public String getUser(){return user;}
    public void setUser(String user){this.user=user;}
    public String getPass(){return pass;}
    public void setPass(String pass){this.pass=pass;}
    public String getRealname(){return realname;}
    public void setRealname(String realname){this.realname=realname;}
    public String getGender(){return gender;}
    public void setGender(String gender){this.gender=gender;}
    public String[] getChanel(){return chanel;}
    public void setChanel(String[] chanel){this.chanel=chanel;}
    public static Long getserialVersionID(){return serialVersionID;}
}








