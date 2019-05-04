package com.drclb.lambda.fnctionalInterface;

import com.drclb.common.Person;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

/**
 *
 */
public class SupplierExample {
    private static final Logger _logger = LoggerFactory.getLogger("SupplierExample");

    public static void main(String[] args) {
        Supplier<String> defaultLocSupplier = () -> "Canada";
        new SupplierExample()
                .persistPerson(defaultLocSupplier, new Person("sam", "USA")) // test 1
                .persistPerson(defaultLocSupplier, new Person("sam", null)); //test 2
    }

    public SupplierExample persistPerson(Supplier<String> personDefaultLocationSuplier, Person person){
        _logger.info("Per validating personp["+person+"] before persisting....");

        if(StringUtils.isBlank(person.getLoc()))
            person = new Person(person.getName(), personDefaultLocationSuplier.get());
        _logger.info("Persisting person" + person);
        return this;
    }
}
