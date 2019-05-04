package com.drclb.lambda.fnctionalInterface;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BinaryOperator;

/**
 * Represents an operation on two arguments of tpe T and producing result of same type T
 */
public class BinaryOperatorExample {
    private static final Logger _logger = LoggerFactory.getLogger("BinaryOperatorExample");
    public static void main(String[] args) {
        BinaryOperator<String> stringConcatinator = (string1, string2 ) -> {
            if(StringUtils.isBlank(string1))
                string1 = "-/Empty String1";
            if (StringUtils.isBlank(string2))
                string2 = "-/Empty string2";
            return string1.concat(string2);
        };
        new BinaryOperatorExample().applyOperation(stringConcatinator);
    }

    public BinaryOperatorExample applyOperation(BinaryOperator<String> operator) {
        _logger.info("Example 1 wih string values 'test1' and null, Result is : "+ operator.apply("test1", null));
        _logger.info("Example 2 wih string values 'test2' and '', Result is : "+operator.apply("test2", ""));
        _logger.info("Example 1 wih string values 'test3' and 'Test4', Result is : "+operator.apply("test3", "Test4"));
        return this;
    }

}
