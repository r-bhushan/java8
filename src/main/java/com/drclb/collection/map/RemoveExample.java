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

package com.drclb.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrate the remove function of {@link Map} and compare with existing remove with new remove
 * function added in java 8
 *
 *
 * Example use case: In a map of color with order as its identifier/key, remove the color entry whose id is 2
 * and color is green
 */
public class RemoveExample {

    public static void main(String[] args) {
        Map<Integer, String> colorOrder = new HashMap<>(2);
        colorOrder.put(1, "red");
        colorOrder.put(2, "green");
        colorOrder.put(3, "blue");
        colorOrder.put(4, "white");


        //Java 7 remove
        System.out.println("Remove Operation with Java 7");
        System.out.println("was removal Key 1 successful ? " + colorOrder.remove(1));

        // java 8
        System.out.println("Remove Operation with Java 8");
        System.out.println("Remove key 2 , whose value is blue, Successfully removed ? " + colorOrder.remove(2, "blue"));
        System.out.println("Remove key 2 , whose value is Green, Successfully removed ? " + colorOrder.remove( 2, "green"));
    }
}

