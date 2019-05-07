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

package com.drclb.lambda.functionalInterface;

import com.drclb.common.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * {@link java.util.function.BiConsumer} is similar to {@link java.util.function.Consumer} only dfference is
 * {@link java.util.function.Consumer} accepts only one argument but {@link java.util.function.BiConsumer}
 * accepts 2 arguments of different type.
 * <p>
 * Both Functional Interface returns nothing
 */
public class BiConsumerExample {


    public static void main(String[] args) {
        BiConsumer<Integer, String> applicationPolOperator = (applicationId, name) ->
                System.out.println("Triggering process for application having id [" + applicationId + "], and name [" + name + "]");
        Map<Integer, String> applicationPool = new HashMap<>(2);
        applicationPool.put(1,"application1");
        applicationPool.put(2,"application2");
        applicationPool.forEach(applicationPolOperator);
    }

}