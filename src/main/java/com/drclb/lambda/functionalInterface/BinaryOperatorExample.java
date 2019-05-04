package com.drclb.lambda.functionalInterface;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BinaryOperator;

/**
 * This class represent usage of BinaryOperator Functional Interface.
 * {@link BinaryOperator#apply(Object, Object)} consumes two arguments of tpe T and
 * processing both arguments and returning  result Of same type T
 *
 * Example Use case: in this class we want to concatenate and print 2 string objects into one.
 * But before concatenating if either of string is null or empty,
 * replace it with text "-/Empty String1" OR "-/Empty string2"
 */
public class BinaryOperatorExample {
    private static final Logger log = LoggerFactory.getLogger("BinaryOperatorExample");
    public static void main(String[] args) {
        BinaryOperator<String> stringConcatenate = (string1, string2 ) -> {
            if(StringUtils.isBlank(string1))
                string1 = "-/Empty String1";
            if (StringUtils.isBlank(string2))
                string2 = "-/Empty string2";
            return string1.concat(string2);
        };
        new BinaryOperatorExample().applyOperation(stringConcatenate);
    }

    public BinaryOperatorExample applyOperation(BinaryOperator<String> operator) {
        log.info("Example 1 wih string values 'test1' and null, Result is : "+
                operator.apply("test1", null));

        log.info("Example 2 wih string values 'test2' and '', Result is : "+
                operator.apply("test2", ""));

        log.info("Example 1 wih string values 'test3' and 'Test4', Result is : "+
                operator.apply("test3", "Test4"));
        return this;
    }

}
