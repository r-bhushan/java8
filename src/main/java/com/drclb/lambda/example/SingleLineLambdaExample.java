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

package com.drclb.lambda.example;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class demonstrates a lambda expression for an Functional Interface having method {@link Print#out(Person)}
 * required one argument.
 * Also, demonstrate lambda expression in a single line
 */
public class SingleLineLambdaExample {
    private static final Logger log = LoggerFactory.getLogger("SingleLineLambdaExample");

    public static void main(String[] args) {
       Person person = PersonBuilder.getSinglePerson();
       Print printPerson = personObj -> System.out.println(personObj.getName() +"---"  + personObj.getLoc());
       printPerson.out(person);
    }
    private interface Print {
        void out(Person person);
    }
}
