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

package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class to Sort a list of integers using {@link Stream#sorted()} method.
 *
 * Stream also exposes a {@link Stream#sorted(Comparator)}  method which accepts a comparator to facilitate
 * complex objects sorting
 */
public class SortOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 5, 9, 6);
        System.out.println("Number before sorting....");
        System.out.println(numbers + System.lineSeparator());
        new SortOperation().process(numbers);

    }

    public SortOperation process(List<Integer> number) {
        System.out.println("Number before sorting....");
        System.out.println(number.stream().sorted().collect(Collectors.toList()));
        return this;
    }
}
