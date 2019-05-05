package com.drclb.common;

import java.util.Objects;

/**
 * This class represents a Data Model of Person entity, which being leveraged in the rest
 * of the code examples.
 */
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
    public Person setLoc(String loc){_location = loc; return this;}
    @Override
    public String toString() {
        return "Person{" +
                "_name='" + _name + '\'' +
                ", _location='" + _location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(_name, person._name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_name);
    }
}

