/*
 * This program illustrate the java 8 features for training purpose
 *     Copyright (c) 2019. Ravi Bhushan
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.drclb.foreach;

import com.drclb.common.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.drclb.common.PersonBuilder.getDummyPersonList;

/**
 * For each with List
 */
public class ForEach {

    public void iterateInJava7() {
        for (Person p : getDummyPersonList()) {
            System.out.println(p);
        }
    }

    public void iterateInJava8() {
        // For each accepts cnsumer, which is a functional interface. Consumer exc
        getDummyPersonList().forEach(person -> System.out.println(person));

        // Example2: how to chain the multiple consumer in for each
        Consumer<Person> consumerPersonNamePrint = person -> System.out.println(person.getName());
        Consumer<Person> consumerPersonLocPrint = person -> System.out.println(person.getLoc());
        getDummyPersonList().forEach(consumerPersonNamePrint.andThen(consumerPersonLocPrint));

        // Example3: How not to use it.
        // Why?? createWithOF an anonymous class a compile time with name ForEach$1.class.
        getDummyPersonList().forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });

    }

    public static void main(String[] args) {
        new ForEach().iterateInJava8();
    }


}
