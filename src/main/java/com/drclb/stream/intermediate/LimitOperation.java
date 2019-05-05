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

package com.drclb.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * class to process limited number of persons exist in the immigration pool.
 * By leveraging {@link java.util.stream.Stream#limit(long)} method which accepts a long/number value
 * to restrict the immigration application count
 */
public class LimitOperation {
    public static void main(String[] args) {
        List<Integer> immigrationApplicationIds = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        new LimitOperation().processLimitedApplication(immigrationApplicationIds, 2);
    }

    public LimitOperation processLimitedApplication(List<Integer> applicationIDBatch, int limit) {
        applicationIDBatch.stream()
                .limit(limit)
                .forEach(applicationId ->
                        System.out.println("Processing Immigration application having id[" + applicationId + "]"));
        return this;
    }
}
