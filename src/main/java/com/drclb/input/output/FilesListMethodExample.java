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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * This class demonstrates java 8 example on how to read content of a directory
 * Return a lazily populated Stream, the elements of which are the entries in the directory.
 * Also, returned list of Path is does not contain sub Paths.
 * <p>
 * Reference : https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#list-java.nio.file.Path-
 */
public class FilesListMethodExample {

    private static String ROOT = ".\\";

    public static void main(String[] args) throws IOException {
        new FilesListMethodExample().java8()
        .java7();
    }

    public FilesListMethodExample java8() throws IOException {
        StringJoiner joinPath = new StringJoiner(",","Java 8 Example - [","]");
        try (Stream<Path> directoryContent = Files.list(Paths.get(ROOT))) {
            directoryContent.forEach(path -> joinPath.add(path.toString()));
        }
        System.out.println(joinPath.toString());
        return this;
    }

    public FilesListMethodExample java7() {
        StringJoiner joinPath = new StringJoiner(",","Java 7 Example - [","]");
        File directory = new File(ROOT);
        File[] content = directory.listFiles();
        for (File file : content){
            joinPath.add(file.getPath());
        }
        System.out.println(joinPath.toString());
        return this;
    }
}
