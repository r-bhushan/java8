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

package com.drclb.input.output;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 *
 */
public class FilesWalkExample {
    private static  String ROOT =".\\";
    public static void main(String[] args) throws IOException {
        new FilesWalkExample().java8().java7();
    }

    public FilesWalkExample java8() throws IOException {
        StringJoiner joiner = new StringJoiner(",","Java 8 EXample [","]" );
        Stream<Path> recursivePAth = Files.walk(Paths.get(ROOT),2,FileVisitOption.FOLLOW_LINKS);
        recursivePAth.forEach(path -> joiner.add(path.toString()));
        System.out.println(joiner.toString());
        return this;
    }


    public FilesWalkExample java7() throws IOException {
        System.out.println(System.lineSeparator() + "Java 7 Example: ");
        Files.walkFileTree(Paths.get(ROOT),EnumSet.of(FileVisitOption.FOLLOW_LINKS),2,new CustomFileVisitorJava7<Path>());
        return this;
    }

    private class CustomFileVisitorJava7<T> extends SimpleFileVisitor<T>{
        @Override
        public FileVisitResult visitFile(T file, BasicFileAttributes attrs)
                throws IOException
        {
            System.out.println(file);
            return super.visitFile(file,attrs);
        }
    }
}
