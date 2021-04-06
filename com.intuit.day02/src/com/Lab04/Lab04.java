package com.Lab04;
/*
* * Implement the formula __a^2 + b^2 + 2ab__
* You have __a=10 and b=12__

* Use the following code as starting point

```java
public class Lab04 {

	public static void main(String[] args) {

		//YOUR CODE GOES HERE


		//DO NOT MODIFY THE FOLLOWING LINES
		final int result = aSquare
			.andThen(bSquare)
			.andThen(twoAB)
			.apply(new Params(10, 12, 0))
			.result;
		System.out.println(result);
	}

}

//YOU CAN USE THIS CLASS
class Params {
	public final int a, b, result;
	public Params(int a, int b, int result) {
		this.a = a;
		this.b = b;
		this.result = result;
	}
}
```

* Use __Params__ class to hold data that you pass around __Function__
* */

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lab04 {

    public static void main(String[] args) {

        //YOUR CODE GOES HERE

        Function<Params, Params> aSquare = (p) -> new Params(p.a, p.b, p.result+p.a*p.a);
        Function<Params, Params> bSquare = (p) -> new Params(p.a, p.b, p.result+p.b*p.b);
        Function<Params, Params> twoAB = (p) -> new Params(p.a, p.b, p.result+2*p.a*p.b);


        //DO NOT MODIFY THE FOLLOWING LINES
        final int result = aSquare
                .andThen(bSquare)
                .andThen(twoAB)
                .apply(new Params(10, 12, 0))
                .result;
        System.out.println(result);
    }

}

//YOU CAN USE THIS CLASS
class  Params {
    public final int a, b, result;
    public Params(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
}
