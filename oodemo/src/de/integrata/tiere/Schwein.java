package de.integrata.tiere;

public class Schwein {

    // Instanzvariablen
    private String name;
    private int gewicht;

    // KLassenvariablen
    private static int anzahl;

    // KLassenmethode (static)
    public static int getAnzahl() {
        return anzahl;
    }

    // Staischer Konstruktor
    static {
        anzahl = 0;
    }

    // Instanz Konstruktor
    public Schwein() {
        name = "Nobody";
        gewicht = 10;
        anzahl ++;
    }

    // Destructor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Quiiiieeeeek");
        anzahl --;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || "Elsa".equals(name)) throw new IllegalArgumentException("Häh?");
         this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    // Instanzmethoden
   public void fressen() {
        gewicht ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }


}
