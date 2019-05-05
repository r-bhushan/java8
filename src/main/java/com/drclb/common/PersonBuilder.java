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

package com.drclb.common;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is utility class to create dummy person objects to be used in examples
 */
public class PersonBuilder {

    private static final Person JOHN = new Person("John", "canada");
    private static final Person SAM = new Person("sam", "USA");
    private static final Person TOM = new Person("tom", "hong kong");

    public static List<Person> getDummyPersonList() {
        List<Person> persons = new ArrayList<>();
        persons.add(JOHN);
        persons.add(SAM);
        persons.add(TOM);
        return persons;
    }

    public static Person[] getPersonsAsArray() {
        return new Person[]{
                JOHN, SAM, TOM
        };
    }

    public static Person getSinglePerson(){
        return JOHN;
    }
}
