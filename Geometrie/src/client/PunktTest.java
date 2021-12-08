package client;

import de.integrata.geometrie.Kreis;
import de.integrata.geometrie.Punkt;

public class PunktTest {

    public static void main(String[] args) {
        Kreis p = new Kreis();
        System.out.println(p);


        for (int i = 0; i < 15; i++) {
            p.rechts();
            System.out.println(p);
        }
    }
}
