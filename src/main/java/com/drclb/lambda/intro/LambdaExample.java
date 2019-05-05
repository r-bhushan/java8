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

package com.drclb.lambda.intro;

import com.drclb.common.Person;

public class LambdaExample {
    public String generateAndcall(){
        Person personObj = new Person("Ravi Bhushan", "Canada");
        Greeter greeter = (person) -> new StringBuilder("Hello")
                .append(" ").append(person.getName()).toString();

        // Alternate way to write above with lambda
        Greeter greeterAlternate = (person) -> {
            System.out.println("Do more processng");
            return new StringBuilder("Hello").append(" ").append(person.getName()).toString();
        };

        return greeter.greet(personObj);

    }
}
