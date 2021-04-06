/*
*
* * Given a user name,
 * validate if it's _blank_ and _not null_ and _empty_ and _length between 5 and 10 chars_

 * Given a password,
 * validate if it's _blank_ and _not null_ and _empty_ and _length between 3 and 8 chars_

 * Reuse Predicates and chain them
 * */

import java.util.function.Predicate;

public class LAB02 {
    public static void main(String[] args) {
        String userName = "Rishabh";
        String pass = "39";

        Predicate<String> notNull = value -> !value.isEmpty();
        Predicate<String> uLengthValidation  =  value ->  value.length() >= 5 && value.length() <= 10;
        Predicate<String> pLengthValidation  =  value ->  value.length() >= 3 && value.length() <= 8;

        //username validation
        System.out.println(notNull
                .and(uLengthValidation)
                .test(userName));

        //password validation
        System.out.println(notNull
                .and(pLengthValidation)
                .test(pass));
    }
}
