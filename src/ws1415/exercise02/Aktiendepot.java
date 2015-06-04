package ws1415.exercise02;

import ws1415.exercise01.Aktie;

import java.util.Arrays;
import java.util.HashMap;


public class Aktiendepot {
    private HashMap<String, Aktie> aktien;

    public Aktiendepot() {
        this.aktien = new HashMap<String, Aktie>();
    }

    // b)
    public void bucheAktieEin(Aktie a) {
        if(this.aktien.containsKey(a.getName())) {
            return;
        }
        this.aktien.put(a.getName(), a);
    }

    // c)
    public Aktie leseAktieAus(String name) {
        return this.aktien.get(name);
    }

    // d)
    public Aktie[] alleAktien() {
        return (Aktie[]) this.aktien.values().toArray();
    }

    // e)
    public Aktie[] alleAktienNachNamen() {
        Aktie[] alleAktien = this.alleAktien();
        Arrays.sort(alleAktien, new AktienNameComparator());
        return alleAktien;
    }

    // f)
    public Aktie[] alleAktienNachWert() {
        Aktie[] alleAktien = this.alleAktien();
        Arrays.sort(alleAktien, new AktienWertComparator());
        return alleAktien;
    }

}
