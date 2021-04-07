import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {
    static Map<Integer, String> romanNum = new HashMap<>();
    public static void main(String[] args) {
        romanNum.put(1, "I");
        romanNum.put(2, "II");
        romanNum.put(3, "III");

        //Normal way
        String one = getRoman(1);
        System.out.println(one.length());
        String thirty = getRoman(30); //would throw a null pointer exception, to avoid exception we would have to handle it with IF condition.
//        System.out.println(thirty.length());

/*
* Its a bad design to return NULL from methods.
* */

        //Using optional, optional can be used where return type is unpredictable

        Optional<String> one1 = getOptRoman(1);
        System.out.println("opt "+ one1.get());
        Optional<String> thirty1 = getOptRoman(30); //if the value is present then it will print or else throw an error
        System.out.println("opt "+ thirty1.get());


    }
    public static Optional<String> getOptRoman(int num){
        String  val = romanNum.get(num);
        Optional<String> res = Optional.ofNullable(val);
        res.orElseThrow(ElementNotFound::new);
        return res;
    }

    public static String getRoman(int num){
        return romanNum.get(num);
    }
}
class ElementNotFound extends RuntimeException {}
