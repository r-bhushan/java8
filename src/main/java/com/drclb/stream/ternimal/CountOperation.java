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

import com.drclb.common.Person;
import com.drclb.common.PersonBuilder;
import org.omg.CORBA.PERSIST_STORE;

import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

public class CountOperation {
    public static void main(String[] args) {
        Stream<Person> immigrationApplicationStream = PersonBuilder.getDummyPersonList().stream();
        new CountOperation().reportOnTotalPendingApplications(immigrationApplicationStream);
    }

    public CountOperation reportOnTotalPendingApplications(Stream<Person> applicationSream){
        long totalApplications = applicationSream.count();
        System.out.println("Total Number of pending applications -> " + totalApplications );
        return this;
    }
}
