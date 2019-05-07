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

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        new SortExample().orderJava8().java7();
    }

    public SortExample orderJava8() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 9, 6);
        System.out.println("Java 8 example .....");
        System.out.println("original list " + numbers);
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sorting after natural order operation: " + numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorting after reverse order operation : " + numbers);
        return this;
    }

    public SortExample java7() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 9, 6);
        System.out.println("Java 7 example .....");
        System.out.println("original list " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorting after natural order operation: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Sorting after reverse order operation : " + numbers);
        return this;
    }
}
