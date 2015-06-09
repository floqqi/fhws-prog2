package ss14.exercise03;

import java.util.*;

public class Repeater extends TimerTask {
    String m;
    int c;
    int d;

    // a)
    Repeater(String m, int d, int c) {
        this.m = m; // Der String der ausgegeben werden soll.
        this.c = c; // Anzahl, wie oft der String `m` ausgegeben werden soll.
        this.d = d; // Dauer, wie lange bis zur naechsten Ausgabe gewartet wird.
        delay();
    }

    public void delay() {
        Timer t = new Timer();
        t.schedule(this, d);
    }

    public void run() {
        System.out.print(m);
        c--;
        if (c > 0)
            new Repeater(m, d, c);
    }

    // b)
    // klopf klopf klopf Penny
    // klopf klopf klopf Penny
    // klopf klopf klopf Penny
    public static void main(String[] args) {
        new Repeater(" klopf ", 300, 9);
        new Repeater(" Penny \n", 1000, 3);
    }
}
