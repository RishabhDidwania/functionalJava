import java.util.HashSet;
import java.util.Set;

public class WorkingOfStreams {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Kolkata");

        cities
                .stream()
                .filter(e->{
                    System.out.println("-----filter called "+ e);
                    return e.startsWith("C");
                })
                .map(e->{
                    System.out.println("-----map called "+ e);
                    return e.toLowerCase();
                })
                .forEach(System.out::println);

        System.out.println("------------------------");

        String res =
                cities
                        .stream()
                        .filter(e->{
                            System.out.println("-----filter called "+ e);
                            return e.startsWith("C");
                        })
                        .map(e->{
                            System.out.println("-----map called "+ e);
                            return e.toLowerCase();
                        })
                        .findAny()
                        .get();

        System.out.println(res);



    }
}
