import java.util.function.Predicate;

public interface ValidationConstants {

    Predicate<String> notNull = value -> value != null;
    Predicate<String> notEmpty = value -> !value.isEmpty();
    static Predicate<String> lengthGreaterThan(int num){
        return value -> value.length() >= num;
    }
    static Predicate<String> lengthLessThan(int num){
        return value -> value.length() <= num;
    }
}
