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

package com.drclb.stream.ternimal;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;

import java.util.List;
import java.util.stream.Stream;

public class ToArrayOperation {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(PersonBuilder.getSinglePerson());
        new ToArrayOperation().process(personStream);
    }

    public ToArrayOperation process(Stream<Person> personStream){
        System.out.println(personStream);

        Person[] personArray = personStream.toArray(Person[]::new);
        System.out.println(personArray);
        return this;
    }
}
