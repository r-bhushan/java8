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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class FlatMapOperation1 {

    public static void main(String[] args) {
        List<Person> ontarioPNPApprovedApplication = Arrays.asList(
                new Person("John Wick", "usa"),
                new Person("Mr. Chow", "usa")
        );
        List<Person> albertaPNPApprovedAplication = Arrays.asList(
                new Person("Hancock", "brazil")
        );

        List<List<Person>> federalImmigrationApplicationPool = Arrays.asList(ontarioPNPApprovedApplication,
                albertaPNPApprovedAplication);
        new FlatMapOperation1().processApproved(federalImmigrationApplicationPool);
    }

    public FlatMapOperation1 processApproved(List<List<Person>> pool) {
        List<Person> singleApplicationPool = pool.stream().flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(singleApplicationPool);
        return this;
    }


}
