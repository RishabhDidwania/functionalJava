package com.calc;
import java.io.InputStream;
import java.util.Scanner;
import java.util.function.BiFunction;

import static com.calc.CalcOperation.*;

/* You have a Calculator class as given below

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
        * Create a functional interface called __Calc__ with an abstract method that accepts two arguments and returns an int.

        * Create Lab01.java with a **main()** method.
        * In the __main()__ create Lambda expressions for add, subtract and multiply using __Calc__
        * Create a new method called __operate(Calc calc)__ in Lab04 and pass your lambdas as arguments
*/

public class Lab02 {
    public static void main(String[] args) {
        operate(adder);
        operate(subtract);
        operate(mul);
    }
    public static void operate(BiFunction<Integer, Integer, Integer> fun){
        Scanner sn  = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();

        System.out.println(fun.apply(a,b));
    }
}
