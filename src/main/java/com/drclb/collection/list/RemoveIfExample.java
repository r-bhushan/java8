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

package com.drclb.collection.list;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Java 8 includes  RemoveIF in collections api which accept a predicate and triggers an internal iterator for removal process
 * https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html#removeIf-java.util.function.Predicate-
 * <p>
 * <p>
 * Example Usecase: remove person(s) from the canadian immigration pool, who is already in canada
 */
public class RemoveIfExample {

    public static void main(String[] args) {
        new RemoveIfExample().processInJava8().processInJava7();
    }

    public RemoveIfExample processInJava8() {
        System.out.println("Java 8 example - ");
        List<Person> persons = PersonBuilder.getDummyPersonList();
        persons.removeIf(person -> person.getLoc().equalsIgnoreCase("canada"));
        System.out.println("New pool of application - " + persons);
        return this;
    }

    public RemoveIfExample processInJava7() {
        System.out.println("Java 7 example - ");
        List<Person> persons = PersonBuilder.getDummyPersonList();
        List<Person> personToRemoveFromPool = new ArrayList<>();
        for (Person person : persons) {
            if (person.getLoc().equalsIgnoreCase("canada"))
                personToRemoveFromPool.add(person);
        }
        persons.removeAll(personToRemoveFromPool);
        System.out.println("New pool of application - " + persons);
        return this;
    }
}

