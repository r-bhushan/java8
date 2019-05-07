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
 *
 */
public class ReplaceExample {
    public static void main(String[] args) {
        Map<Integer, String> colorOrder = new HashMap<>(2);
        colorOrder.put(1, "red");
        colorOrder.put(2, "green");
        colorOrder.put(3, "blue");
        colorOrder.put(4, "white");

        System.out.println("Replacing value for key 1 if its green, result is - " +
                colorOrder.replace(1,"green", "brown"));


        System.out.println("Replacing value for key 1 if its red, result is - " +
                        colorOrder.replace(1,"red", "brown"));



    }
}
