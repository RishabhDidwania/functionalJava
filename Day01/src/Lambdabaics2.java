//
public class Lambdabaics2 {
    public static void main(String[] args){

        Adder adder = (a,b) -> a+b;
        System.out.println(adder.sum(2,4));

        Adder adder2 = (a, b) -> {
            System.out.println("Adding " + a + " and " + b);
            return a + b;
        };
        System.out.println(adder2.sum(0, 5));


        Adder adder3 = (int a, int b) -> a + b;

    }
}

//Functional interface are those that have only one abstract method
@FunctionalInterface
interface Adder {
    int sum (int a ,int b);
}
