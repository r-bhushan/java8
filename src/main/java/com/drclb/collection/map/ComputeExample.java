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

package com.drclb.collection.map;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * This class demonstrate the, {@link Map#compute(Object, BiFunction)}
 * <p>
 * Compute is used to modify the value in a lazy manner. Compute method gets the value using the provided key and
 * apply BiFunctional interface on it
 */
public class ComputeExample {

    public static void main(String[] args) {
        Map<String, List<Person>> persons = PersonBuilder.getDummyPersonList().stream()
                .collect(Collectors.groupingBy(Person::getLoc));

        System.out.println("Before Compute....");
        System.out.println(persons);
        // BiFunction  -
        persons.compute("USA", (existingKey, existingValue) -> existingValue.stream()
                .map(sr -> sr.setLoc(sr.getLoc().toLowerCase())).collect(Collectors.toList()));

        System.out.println("After Compute......");
        System.out.println(persons);


    }
}
