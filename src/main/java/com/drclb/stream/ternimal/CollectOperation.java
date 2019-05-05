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

package com.drclb.stream.ternimal;

import com.drclb.common.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOperation {
    public static void main(String[] args) {
        Stream.Builder<Person> personBuilder = Stream.builder();
        Stream<Person> personStream = personBuilder.add(new Person("Robert", "Canada"))
                .add(new Person("Nancy", "Canada"))
                .add(new Person("Helena", "USA"))
                .add(new Person("Mike", "Ireland"))
                .add(new Person("prince", "USA"))
                .add(new Person("Vlad", "Russia")).build();
        new CollectOperation().process(personStream);


    }

    public CollectOperation process(Stream<Person> personStream) {
        Set<String> personMap = personStream
                .collect(
                        Collectors.mapping((Person person) -> person.getLoc(), //passing a function to process the object before collecting
                        Collectors.toSet()));

        System.out.println(personMap);

        return this;
    }
}
