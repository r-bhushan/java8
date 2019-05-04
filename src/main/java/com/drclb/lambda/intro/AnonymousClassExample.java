package com.drclb.lambda.intro;

import com.drclb.common.Person;

public class AnonymousClassExample {

    public String generateAndcall(){
        final Person personObj = new Person("Ravi Bhushan", "Canada");

        Greeter greetPerson = new Greeter() {
            public String greet(Person person) {
                return new StringBuilder("Hello").append(" ").append(person.getName()).toString() ;
            }
        };
        return greetPerson.greet(personObj);
    }
}
