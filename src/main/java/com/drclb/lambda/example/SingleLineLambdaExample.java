package com.drclb.lambda.example;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleLineLambdaExample {
    private static final Logger log = LoggerFactory.getLogger("SingleLineLambdaExample");

    public static void main(String[] args) {
       Person person = PersonBuilder.getSinglePerson();
       Print printPerson = personObj -> System.out.println(personObj.getName() +"---"  + personObj.getLoc());
       printPerson.out(person);
    }
    private interface Print {
        void out(Person person);
    }
}
