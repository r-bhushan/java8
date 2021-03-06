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
import com.drclb.common.PersonBuilder;

import java.util.stream.Stream;

public class NoneMatchOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new NoneMatchOperation().process(immigrationApplicationStream, "Brazil");
    }

    public NoneMatchOperation process(Stream<Person> applicationStream, String countryLoc){
        boolean result = applicationStream
                .noneMatch(application -> application.getLoc().equalsIgnoreCase(countryLoc));
        System.out.println("Are all applications not from country [" + countryLoc + "] ? - " + result);

        return this;
    }
}
