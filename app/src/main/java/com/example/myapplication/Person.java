package com.example.myapplication;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    private String id;
    private String password;

    public Person(String name, String id, String password)
    {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format("이름: %s\n" +
                            "아이디: %s\n" +
                            "비밀번호: %s", name, id, password);
    }
}
