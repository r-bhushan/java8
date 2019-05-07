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

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Read a file under resource folder using java 8 stream. This Class also demonstrate how it use to done prior java 7
 */
public class FilesLinesMethodExample {
    private static final String FILE_NAME = "/fileTest.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        new FilesLinesMethodExample().java8().java7();
    }

    public FilesLinesMethodExample java8() throws IOException, URISyntaxException {
        URI uri = this.getClass().getResource(FILE_NAME).toURI();
        try (Stream<String> lineStream = Files.lines(Paths.get(uri))) {
            lineStream.filter(line -> line.contains("since") || line.contains("source"))
                    .forEach(System.out::println);
        }
        return this;
    }

    public FilesLinesMethodExample java7() throws IOException, URISyntaxException {
        URI uri = this.getClass().getResource(FILE_NAME).toURI();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(uri), StandardCharsets.UTF_8)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("since") || line.contains("source")) {
                    System.out.println(line);
                }
            }
        }
        return this;
    }
}
