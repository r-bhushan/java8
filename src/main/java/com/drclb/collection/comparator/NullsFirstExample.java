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

package com.drclb.collection.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * This class demonstrates nullsFirst comparator, which treats null values less than non null values
 * example:  null < 1
 */
public class NullsFirstExample {

    public static void main(String[] args) {
        new NullsFirstExample().process();
    }

    public NullsFirstExample process() {
        List<Integer> number = Arrays.asList(1, null, 2, 5);
        Comparator<Integer> comparator = (x, y) -> x - y;
        number.sort(Comparator.nullsFirst(comparator));
        System.out.println(number);
        return this;
    }
}
