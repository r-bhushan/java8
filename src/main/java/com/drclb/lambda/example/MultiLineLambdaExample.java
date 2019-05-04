package com.drclb.lambda.example;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

public class MultiLineLambdaExample {
    public static void main(String[] args) {
        Person person = PersonBuilder.getSinglePerson();
        Print printPerson = personObj ->
        {
            System.out.println("Validating person before trigering the ID cards print command...");
            System.out.println("Printing I.D card for person [" + personObj.getName() + "]");
        };
        printPerson.out(person);
    }

    private interface Print {
        void out(Person person);
    }
}
