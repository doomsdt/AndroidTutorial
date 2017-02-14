package com.soapcopy.tutorial.objects;

import java.util.Stack;

/**
 * Created by Dev on 2017-02-13.
 */

public class Singer {
    String name;
    int age;

    static int total = 0;
    static Stack<Singer> singers = new Stack<>();

    public Singer(){}

    public Singer(String name, int age){
        this();
        this.name = name;
        this.age = age;
        total++;
        singers.push(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTotal() {
        return total;
    }

    public static Singer getRecent(){
        if(!singers.empty()){
            return singers.peek();
        }

        else{
            return null;
        }
    }
}
