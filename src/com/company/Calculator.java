package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.function.*;

public class Calculator {

    public Calculator() {

    }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //    BinaryOperator<Integer> devide = (x, y) -> x / y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            System.out.println("на 0 делить нельзя!");
            return 0;
        } else
            return x / y;
    };
    //System.out.println("на 0 делить нельзя!")
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
