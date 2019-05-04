package com.drclb.common;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilder {

    private static final Person JOHN = new Person("John", "canada");
    private static final Person SAM = new Person("sam", "USA");
    private static final Person TOM = new Person("tom", "hong kong");

    public static List<Person> getDummyPersonList() {
        List<Person> persons = new ArrayList<>();
        persons.add(JOHN);
        persons.add(SAM);
        persons.add(TOM);
        return persons;
    }

    public static Person[] getPersonsAsArray() {
        return new Person[]{
                JOHN, SAM, TOM
        };
    }
}
