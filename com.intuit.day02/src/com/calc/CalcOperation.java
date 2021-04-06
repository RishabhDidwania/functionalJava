package com.calc;

import java.util.function.BiFunction;

public interface CalcOperation {
    BiFunction<Integer,Integer, Integer> adder = (a,b) -> a+b;
    BiFunction<Integer,Integer, Integer> subtract = (a,b) -> a-b;
    BiFunction<Integer,Integer, Integer> mul = (a,b) -> a*b;
}
