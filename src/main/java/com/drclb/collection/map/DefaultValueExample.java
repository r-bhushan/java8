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

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * Class demonstrate {@link java.util.Map#getOrDefault(Object, Object)} example.
 *
 * existing get method returns null in case key not found. This will lead to {@link NullPointerException}
 *
 *
 * Example Use case: find the list of shoe based on brand name
 */
public class DefaultValueExample {

    private static final String EMPTY_VALUE = StringUtils.EMPTY;

    public static void main(String[] args) {
        // represent brand and list of associated shoes
        Map<String, List<String>>  shoeInventory = new HashMap<>(2);
        shoeInventory.put("Nike", Arrays.asList("Nike-Shoe1", "Nike-Shoe2"));
        shoeInventory.put("Rebook", Arrays.asList("Rebook-Shoe1", "Rebook-Shoe2"));

        shoeInventory.getOrDefault("Aldo", new ArrayList<>());

    }

}
