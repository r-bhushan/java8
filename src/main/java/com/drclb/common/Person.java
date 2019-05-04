package com.drclb.common;

public class Person{
    String _name;
    String _location;
    public Person(String name, String loc){
        _name = name;
        _location = loc;
    }
    public String getName(){
        return _name;
    }
    public String getLoc(){
        return _location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "_name='" + _name + '\'' +
                ", _location='" + _location + '\'' +
                '}';
    }
}

