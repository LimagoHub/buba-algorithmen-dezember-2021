package de.integrata.client;

import de.integrata.tiere.Schwein;

public class Schweintest {



    public static void main(String[] args) {


        Schweintest test = new Schweintest();
        test.run();

    }

    private void run() {
        System.out.println(Schwein.getAnzahl());

        // Declaration
        Schwein piggyPointer; // Reference (Adresse des Schweins. Groesse 4 Byte)


        // 1000

        // Instanziierung (das Schwein wird im freien Heapspeicher angelegt und mit Startwerten versehen.)
        piggyPointer = new Schwein();
        System.out.println(Schwein.getAnzahl());

        piggyPointer.setName("Miss Piggy");


        System.out.println(piggyPointer);


        piggyPointer.fressen();

        System.out.println(piggyPointer);
    }


}
