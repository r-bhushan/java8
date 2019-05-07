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

import com.drclb.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeExample {
    private static final String LOC_CANADA = "canada";
    private static final String LOC_USA = "usa";

    public static void main(String[] args) {
        List<Person> immigrationBatch1 = Arrays.asList(
                new Person("Person1", LOC_CANADA),
                new Person("Person2", LOC_CANADA),
                new Person("Person3", LOC_USA)
        );

        List<Person> immigrationBatch2 = Arrays.asList(
                new Person("Person4", LOC_CANADA),
                new Person("Person5", LOC_USA),
                new Person("Person6", LOC_USA)
        );

        Map<String, List<Person>> immigrationBatch1ByLoc =
                immigrationBatch1.stream().collect(Collectors.groupingByConcurrent(per -> per.getLoc()));

        System.out.println(immigrationBatch1ByLoc);
        Map<String, List<Person>> immigrationBatch2ByLoc =
                immigrationBatch2.stream().collect(Collectors.groupingByConcurrent(per -> per.getLoc()));
        System.out.println(immigrationBatch2ByLoc);

        System.out.println(
                new MergeExample().mergeMaps(immigrationBatch1ByLoc, immigrationBatch2ByLoc));
    }

    public MergeExample mergeMaps(Map<String, List<Person>> mappedBatchMaster, Map<String, List<Person>> mappedBatchToMerge) {

        mappedBatchToMerge.entrySet().stream().

                //merge takes 3 values in this
                // 1)key from maptoMerge and to find value in master map
                // 2) value form maptoMerge;
                // 3) BiFunction - It takes 2 arguments of same type and Type will get dictated by original map
                //    Also, first argument will value of the master map for teh key forom step 1
                //    and second value will be value of mapToMerge

                        forEach(entry -> mappedBatchMaster.merge(entry.getKey(), entry.getValue(),
                        (actualValueInMaster, newValue) -> {
                            actualValueInMaster.addAll(newValue);
                            return actualValueInMaster; // mew values got merged
                        }
                ));

        System.out.println("Merged Map....");
        System.out.println(mappedBatchMaster);
        return this;
    }
}
