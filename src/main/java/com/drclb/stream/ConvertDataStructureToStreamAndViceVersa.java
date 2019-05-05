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

package com.drclb.stream;

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertDataStructureToStreamAndViceVersa {
    private static final Logger log = LoggerFactory.getLogger("ConvertDataStructureToStreamAndViceVersa");

    public ConvertDataStructureToStreamAndViceVersa convertListToStream() {
        log.info("Converting List of Persons to Stream and outputting.....");
        List<Person> persons = PersonBuilder.getDummyPersonList();
        persons.stream().forEach(person -> log.info(person.toString()));
        return this;
    }

    public ConvertDataStructureToStreamAndViceVersa convertStreamToList(){
        log.info("Converting Stream of Random numbers to List of Doubles and outputting.....");
        List<Double> randomNumbers= Stream.generate(Math::random).limit(5)
                .collect(Collectors.toList());
        randomNumbers.forEach(number -> log.info(number.toString()));
        return this;
    }

    public static void main(String[] args) {
        new ConvertDataStructureToStreamAndViceVersa()
                .convertListToStream()
                .convertStreamToList();
    }

}
