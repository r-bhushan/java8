package com.drclb.lambda.intro;

import com.drclb.common.Person;

public class LambdaExample {
    public String generateAndcall(){
        Person personObj = new Person("Ravi Bhushan", "Canada");
        Greeter greeter = (person) -> new StringBuilder("Hello").append(" ").append(person.getName()).toString();

        // Alternate way to write above with lambda
        Greeter greeterAlternate = (person) -> {
            System.out.println("Do more processng");
            return new StringBuilder("Hello").append(" ").append(person.getName()).toString();
        };

        return greeter.greet(personObj);

    }
}
