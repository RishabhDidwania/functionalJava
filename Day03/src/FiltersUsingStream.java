import java.util.HashSet;
import java.util.Set;

public class FiltersUsingStream {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Bangalore");
        cities.add("mumbai");

        cities.stream().filter(val->val.startsWith("B")).forEach(System.out::println);
    }
}
