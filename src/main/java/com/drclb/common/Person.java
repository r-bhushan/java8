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

package com.drclb.common;

import java.util.Objects;

/**
 * This class represents a Data Model of Person entity, which being leveraged in the rest
 * of the code examples.
 */
public class Person{
    String _name;
    String _location;
    public Person(String name, String loc){
        _name = name;
        _location = loc;
    }
    public String getName(){
        return _name;
    }
    public String getLoc(){
        return _location;
    }
    public Person setLoc(String loc){_location = loc; return this;}
    @Override
    public String toString() {
        return "Person{" +
                "_name='" + _name + '\'' +
                ", _location='" + _location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(_name, person._name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_name);
    }
}

