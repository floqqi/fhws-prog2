package ws1415.exercise02;

import ws1415.exercise01.Aktie;

import java.util.Comparator;

public class AktienWertComparator implements Comparator<Aktie> {

    @Override
    public int compare(Aktie a1, Aktie a2) {
        return new Double(a1.wert()).compareTo(a2.wert());
    }

}
