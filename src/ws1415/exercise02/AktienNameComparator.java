package ws1415.exercise02;

import ws1415.exercise01.Aktie;

import java.util.Comparator;

public class AktienNameComparator implements Comparator<Aktie> {

    @Override
    public int compare(Aktie a1, Aktie a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
