package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.omg.CORBA.PERSIST_STORE;

import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

public class CountOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new CountOperation().reportOnTotalPendingApplications(immigrationApplicationStream);
    }

    public CountOperation reportOnTotalPendingApplications(Stream<Person> applicationSream){
        long totalApplications = applicationSream.count();
        System.out.println("Total Number of pending applications -> " + totalApplications );
        return this;
    }
}
