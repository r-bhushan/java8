package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.omg.CORBA.PERSIST_STORE;

import java.util.stream.Stream;

public class AnyMatchOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new AnyMatchOperation().isAnyApplicationFromSpecifiedCountry(immigrationApplicationStream, "canada");
    }

    public AnyMatchOperation isAnyApplicationFromSpecifiedCountry(Stream<Person> immigrationApplicationStream, String countryLoc) {
        boolean result = immigrationApplicationStream
                .anyMatch(application -> application.getLoc().equalsIgnoreCase(countryLoc));

        System.out.println("Is there any application from country [" + countryLoc + "] ? - " + result);
        return this;
    }
}
