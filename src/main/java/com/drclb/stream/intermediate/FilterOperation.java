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

package com.drclb.stream.intermediate;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.List;
import java.util.function.Predicate;

/**
 * class to do filtering on the list of person objects and to print all who is from canada
 * {@link java.util.stream.Stream#filter(Predicate)} methods accepts a predicate function, to do filtering
 */
public class FilterOperation {
    public static void main(String[] args) {
        new FilterOperation().filterPersonByLocation("canada");
    }

    public FilterOperation filterPersonByLocation(String locToMatch){
        List<Person>  persons = PersonBuilder.getDummyPersonList();
        persons.stream().
                filter(person -> person.getLoc().equals(locToMatch))
                .forEach(person -> System.out.println("Found match based on location: " + person));
        return this;
    }
}
