package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import com.drclb.foreach.ForEach;

import java.util.List;

public class ForeachOperation {

    public static void main(String[] args) {
        List<Person> persons = PersonBuilder.getDummyPersonList();
        new ForeachOperation().process(persons);
    }

    public ForeachOperation process(List<Person> personList){
        personList.stream().forEach(person -> System.out.println(person));
        return this;
    }
}
