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

package com.drclb.stream.ternimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxOperation {
    public static void main(String[] args) {
        List<Integer> dollarValues = Arrays.asList(100,200, 5000, 10, 90, 80, 1, -2);
        new MaxOperation().process(dollarValues);
    }

    public MaxOperation process(List<Integer> dollarValues){
        Optional<Integer> maxDollarValue =  dollarValues.stream().max((first, second) -> first -second);
        maxDollarValue.ifPresent(value -> System.out.println("Maximum Dollar value is "+ value));
        return this;
    }
}
