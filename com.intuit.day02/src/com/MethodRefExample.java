package com;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void main(String[] args) {

//        Adder adder = (a,b) -> a+b;
        Adder adder = Integer::sum;
        adder.sum(12,5);

        Adder addera = MethodRefExample::summation;
        addera.sum(12,5);

        List<Integer> arr1 = Arrays.asList(1,2,5,6);
//        arr1.forEach(val -> System.out.println(val));
        arr1.forEach(System.out::println);

    }
    static int summation(int a, int b){
        return a+b;
    }



}
interface Adder {
 int sum (int a, int b);
}
