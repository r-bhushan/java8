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

import com.drclb.common.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#thenComparing-java.util.Comparator-
 * Similar concept as SQL order by clause
 */
public class ChainingComparator {

    public static void main(String[] args) {
        new ChainingComparator().process();
    }

    public ChainingComparator process(){
        List<String> number = Arrays.asList("white]","white", "white-]", "red]", "grey]", "orange]");
        Comparator<String> colorOrderByAlphabets = Comparator.naturalOrder();
        Comparator<String> colorOrderByLength = (x,y) -> y.length()-x.length();
        number.sort(colorOrderByLength.thenComparing(colorOrderByAlphabets));
        System.out.println(number);
        return this;
    }
}
