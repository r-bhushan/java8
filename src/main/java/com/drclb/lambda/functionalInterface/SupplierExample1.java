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

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample1 {

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime startTime = LocalDateTime .now();
        LocalDateTime eagerDate = LocalDateTime.now();
        Supplier<LocalDateTime> lazyDate = () -> LocalDateTime.now();
        System.out.println("Process Auditing starts at is -" + startTime);
        Thread.sleep(10000);
        System.out.println("Log auditing with eager date Time - " + eagerDate);
        System.out.println("Log auditing with lazy date Time - " + lazyDate.get());
    }
}
