import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) {



        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();
        List<Integer> l3 = new Vector<>();

        Set<Schwein> schweine = new HashSet<>();

        schweine.add(new Schwein ("Miss Piggy", 10));
        schweine.add(new Schwein ("Miss Piggy", 10));
        schweine.add(new Schwein ("Babe", 20));
        schweine.add(new Schwein ("Lutz", 20));
        schweine.add(new Schwein ("Rudi Rüssel", 20));

        for(Schwein s : schweine) {
            System.out.println(s);
            System.out.println(s.hashCode());
        }

//        int planetenArray[] = new int [5];
//
//        planetenArray[0] = 1000;
//        planetenArray[1] = 2000;
//        planetenArray[2] = 3000;
//        planetenArray[3] = 4000;
//        planetenArray[4] = 5000;
//
//        System.out.println(planetenArray[2]);
//
        Map<String, Integer> planeten = new Hashtable<>();
        planeten.put("Merkur", 1000);
        // planeten["Merkur"] = 1000; Python
        planeten.put("Venus", 2000);
        planeten.put("Erde", 3000);
        planeten.put("Mars", 4000);
        planeten.put("Jupiter", 5000);

        System.out.println(planeten.get("Merkur"));

        Set<String> keys = planeten.keySet();

        for(String planet: keys) {
            System.out.println(String.format("Der Planet %s hat den Umfang %s.", planet, planeten.get(planet)));
        }

    }

    public static  void foo() {
        foo();
    }
}
