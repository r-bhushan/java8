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


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * This class manipulate the list if integers by adding one to it. Before that transforming it consumes
 * {@link Stream#peek(Consumer)} to log oribinal values for auditing
 */
public class PeekOperation {
    private static final Logger log = LoggerFactory.getLogger("PeekOperation");

    public static void main(String[] args) {
        List<Double> randomNumbers = Stream.iterate((double)100, n -> n + Math.random()).limit(5).collect(Collectors.toList());

        new PeekOperation().process(randomNumbers);
    }

    public PeekOperation process(List<Double> randomNumberList) {
        randomNumberList.stream()
                .peek(randomNumber-> log.info("Peek data-> "+randomNumber.toString()))
                .map(randomNumberToTransform -> randomNumberToTransform +1)
                .forEach(randomNumber->
                        log.info("Transformed data -> "+randomNumber.toString()+System.lineSeparator()));
        return this;
    }
}
