package com.example.DEMO.java_web_lab4;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static Map<String,Book> books=new LinkedHashMap<String, Book>();
    static {
        books.put("1",new Book("1","JavaWeb开发"));
        books.put("2",new Book("2","JDBC开发"));
        books.put("3",new Book("3","Java基础"));
        books.put("4",new Book("4","Spring开发"));
        books.put("5",new Book("5","Struts开发"));
    }

    public static Collection<Book> getAll(){   //获得书的全部信息
        return books.values();
    }

    public static Book getBook(String id){     //获得书的某一个信息
        return books.get(id);
    }
}
