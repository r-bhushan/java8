/*
 * This program illustrate the java 8 features for training purpose
 *     Copyright (c) 2019. Ravi Bhushan (ravi-bhushan@hotmail.com)
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

package com.drclb.collection.comparator;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 *  https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-
 *
 *  {@link java.util.Comparator#comparing(Function)} accepts Function interface to extract a key to apply soring o
 */
public class ComparingExample {
    public static void main(String[] args) {
        new ComparingExample().process();
    }

    public ComparingExample process(){
        List<Person> persons = PersonBuilder.getDummyPersonList();
        System.out.println("Original order of Person loc - ");
        persons.forEach(person -> System.out.print(person.getLoc() + " ,"));

        Comparator<Person> comparatorBasedOnPersonLocation = Comparator.comparing(person -> person.getLoc());
        persons.sort(comparatorBasedOnPersonLocation);
        System.out.println(System.lineSeparator());
        System.out.println("Sorted order of Person loc - ");
        persons.forEach(person -> System.out.print(person.getLoc() + " ,"));
        return this;
    }
}
