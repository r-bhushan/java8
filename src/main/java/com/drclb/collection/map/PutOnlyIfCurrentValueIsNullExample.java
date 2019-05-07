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

import java.util.*;

/**
 * This class demonstrate {@link java.util.Map#putIfAbsent(Object, Object)} method usage
 * Alter in prior java 8 version, put ,method exists which replace existing value. But on other hand putIfAbsent
 * method only put if value is null or does not exist and will return the existing value
 *
 *
 * Example Usecase: In a shoe store, requirement is to add a dummy list of shoe to a rand incase
 * specific shoe
 * brand inventory is empty or does not exist
 *
 */
public class PutOnlyIfCurrentValueIsNullExample {

    public static void main(String[] args) {
        Map<String , List<String>> shoeInventory = new HashMap<>(2);
        shoeInventory.put("Rebook", Arrays.asList("Rebook-Shoe1", "Rebook-Shoe2"));

        System.out.println("Put if Absence in rebook inventory "+
                shoeInventory.putIfAbsent("Rebook",Collections.emptyList()));


        // return null value
        System.out.println("Put if Absence in Nike inventory "+
        shoeInventory.putIfAbsent("Nike", Arrays.asList("Coming Soon.....")));
    }
}
