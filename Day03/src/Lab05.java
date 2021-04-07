/*
For the collection below implement the following in Java

Find the largest number Implement with and without using max() function

Find the smallest number Implement with and without using min() function

Find the double of the first even number greater than 3 or else return -1.

Find the sum of the squares of all numbers Implement with and without using sum() function

Find the largest odd number

		List<Integer> numbers =
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
**Hint: ** Use map(), reduce() in Java
*
* */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lab05 {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 20, 7, 8, 9, 10);

        //Find the largest number Implement with and without using max() function
        int largest = numbers
                .stream()
                .reduce((cur, nxt) -> cur>nxt ? cur :nxt).get();
        System.out.println("Without max "+largest);

        int largestWithMax = numbers.stream().mapToInt(e->e).max().getAsInt();
        System.out.println("Without max "+largestWithMax);

        int largestWithMaxAnother = numbers.stream().reduce(Integer::max).get();
        System.out.println("Without max "+largestWithMaxAnother);

        //Find the smallest number Implement with and without using min() function
        System.out.println( "smallest " +numbers.stream().reduce(Integer::min).get());
        System.out.println( "smallest with min " +numbers.stream().mapToInt(e->e).min().getAsInt());


        //Find the double of the first even number greater than 3 or else return -1.
        Predicate<Integer> isEven = val -> val % 2 == 0;
        Predicate<Integer> greaterThanThree = val -> val > 3;
        System.out.println( "double " +numbers
                .stream()
                .filter(isEven.and(greaterThanThree))
                .map(val->val*2)
                .findAny().orElse(-1));


        //Find the sum of the squares of all numbers Implement with and without using sum() function
        System.out.println( "Sumsqr " +numbers
                .stream()
                .map(val->val*val)
                .reduce(Integer::sum)
                .get());

        System.out.println( "Sumsqr with sum " +numbers
                .stream()
                .mapToInt(e->e*e)
                .sum());


        //Find the largest odd number
        System.out.println( "largest odd " +numbers
                .stream()
                .filter(val -> val%2!=0)
                .mapToInt(e->e)
                .max().getAsInt());
        System.out.println( "largest odd without max " +numbers
                .stream()
                .filter(val -> val%2!=0)
                .reduce((cur, nxt)-> cur > nxt? cur :nxt)
                .get()
        );





    }
}
