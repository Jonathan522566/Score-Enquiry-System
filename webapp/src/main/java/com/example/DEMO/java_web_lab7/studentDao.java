package com.example.DEMO.java_web_lab7;

import java.util.HashMap;
import java.util.Map;

public class studentDao {
    public void setStudenInfo(String name,String password,String number,
    String sex,String age,String hobbys){
        Map<String,String> map=new HashMap<>();


    }

    public Map<String,String> getStudenInfo(){
        Map<String,String> map=new HashMap<>();
        map.put("1","zhangsan");
        map.put("2","lisi");
        map.put("3","wangwu");
        return map;
    }
}
