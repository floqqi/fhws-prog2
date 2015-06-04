package ws1415.exercise01;

public class Aktie {
    private String name;
    private double kurs;
    private int anzahl;

    public Aktie() {
        this("Telekom AG", 14.50, 1000);
    }

    public Aktie(String name, double kurs, int anzahl) {
        this.name = name;
        this.kurs = kurs;
        this.anzahl = anzahl;
    }

    // a)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKurs() {
        return this.kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    // b)
    @Override
    public String toString() {
        return "Es gibt " + this.getAnzahl() +
                " Aktien von " + this.getName() +
                " mit einem jeweiligen Kurs von " + this.getKurs();
    }

    // c)
    public double wert() {
        return this.getAnzahl() * this.getKurs();
    }
}
