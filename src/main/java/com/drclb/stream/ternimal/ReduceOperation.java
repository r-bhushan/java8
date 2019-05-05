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

package com.drclb.stream.ternimal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * Class formed a single result from a sequence of elements.
 * leverage {@link java.util.stream.Stream#reduce(BinaryOperator)},
 * {@link BinaryOperator} accepts arguments of type T and returns result of same type
 *
 * Use case:  class to process a list of integers and reduce the total
 */
public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        new ReduceOperation().process(numbers);
    }
    public ReduceOperation process(List<Integer> numbers){
        Optional<Integer> total = numbers.stream()
                .reduce((existingSum, currentNumber) -> existingSum+ currentNumber);
        System.out.println("Total Number -> "+total.get());

        return this;
    }
}
