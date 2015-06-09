package ss14.exercise04;

import java.util.Arrays;

public class Player {
    // Instanzvariable
    String name;
    int numGoals = 0;

    // Konstruktor
    public Player(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getGoals() {
        return numGoals;
    }

    // Tor!!!
    public void score() {
        numGoals++;
    }

    public String toString() {
        return "Der Spieler " + this.name +
                " hat " + this.numGoals + " Tore geschossen.";
    }

    public static void main(String[] args) {
        Player[] players = new Player[]{
                new Player("Podolski"),
                new Player("Lahm"),
                new Player("Mertesacker")
        };
        Arrays.sort(players, new ComparatorName());
        Arrays.sort(players, new ComparatorGoal());

    }
}
