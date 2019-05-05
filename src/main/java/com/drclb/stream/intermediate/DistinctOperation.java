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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * class to find count of unique numbers from a list of integers
 * {@link Stream#distinct()} does not contains any arguments
 */
public class DistinctOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,1,5,9,6); // Total 12 number with duplication
        System.out.println("Count before distinct operation -" + numbers.size());
        new DistinctOperation().findUniqueNumbers(numbers);
    }

    public DistinctOperation findUniqueNumbers(List<Integer> numbers){
        System.out.println("Count of Numbers in list after distinct operation -" +
                numbers.stream().distinct().count());
        return this;
    }
}
