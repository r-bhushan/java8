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

package com.drclb.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/List.html#removeAll-java.util.Collection-
 * Co
 */
public class ReplaceAllExample {

    public static void main(String[] args) {
        new ReplaceAllExample().java8().java7();
    }

    public ReplaceAllExample java8() {

        System.out.println("Java 8 example for ReplaceAll - ");
        List<String> candidateNames = Arrays.asList("RAVI BHUSHAN", "SOME NAME");
        UnaryOperator<String> lowerCaseOperator = name -> name.toLowerCase();
        candidateNames.replaceAll(lowerCaseOperator);
        System.out.println(candidateNames);
        return this;
    }

    public ReplaceAllExample java7() {
        System.out.println("Java 7 example for ReplaceAll - ");
        List<String> candidateNames = Arrays.asList("RAVI BHUSHAN", "SOME NAME");
        List<String> processedCandidateNames = new ArrayList<>(2);
        for (String nam : candidateNames){
            processedCandidateNames.add(nam.toLowerCase());
        }
        System.out.println(processedCandidateNames);
        return this;
    }
}
