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

package com.drclb.string;

import java.util.StringJoiner;

/**
 * String joiner use to join multiple strings with joiner and optional prefix/suffix
 *
 * Example Usecase: would like to create Greeting section of an email i.e "Hi PERSON_NAME,"
 */
public class StringJoinerExample {

    public static void main(String[] args) {
        //Java 8
        System.out.println("Join string in java 8......");
        StringJoiner joinUserFirstAndLastName = new StringJoiner(" ", "Hi ", ",");
        joinUserFirstAndLastName
                .add("Ravi")
                .add("Bhushan");
        System.out.println(joinUserFirstAndLastName.toString());



        //Java 7
        System.out.println("Join string in java 7......");
        StringBuilder builder = new StringBuilder();
        builder.append("Hi ")
                .append("Ravi")
                .append(" ")
                .append("Bhushan")
                .append(",");
        System.out.println(builder.toString());
    }
}
