package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.omg.CORBA.PERSIST_STORE;

import java.util.stream.Stream;

public class AllMatchOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new AllMatchOperation().process(immigrationApplicationStream, "canada");
    }

    public AllMatchOperation process(Stream<Person> applicationStream, String countryLoc){
        boolean result = applicationStream
                .allMatch(application -> application.getLoc().equalsIgnoreCase(countryLoc));
        System.out.println("Are all applications from country [" + countryLoc + "] ? - " + result);
        return this;
    }
}
