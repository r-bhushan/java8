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
 * This class demonstrate the {@link java.util.Map#computeIfPresent(Object, BiFunction)}, its similar to compute only difference
 * is in compute will throw {@link NullPointerException} in case key does not exist. In such case you can use {@link java.util.Map#computeIfPresent(Object, BiFunction)}
 * to eliminate such exception
 */
public class ComputeIfPresentExample {

    public static void main(String[] args) {
        Map<String, List<Person>> persons = PersonBuilder.getDummyPersonList().stream()
                .collect(Collectors.groupingBy(Person::getLoc));
        BiFunction<String, List<Person>, List<Person>> personModifierFunction = (existingKey, existingValue)
                -> existingValue.stream().map(sr
                -> sr.setLoc(sr.getLoc().toLowerCase())).collect(Collectors.toList());
        try {
            persons.compute("USA1",personModifierFunction );
        } catch (NullPointerException ex) {
            System.out.println("Throws Null Pointer exception.... Applying computeIfPresent");
            persons.computeIfPresent("USA1",personModifierFunction);
            System.out.println(persons);
        }
    }

}
