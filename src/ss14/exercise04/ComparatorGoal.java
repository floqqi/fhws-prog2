package ss14.exercise04;

import java.util.Comparator;

public class ComparatorGoal implements Comparator<Player> {

    public int compare(Player p1, Player p2) {
        return new Integer(p1.getGoals()).compareTo(p2.getGoals());
    }

}
