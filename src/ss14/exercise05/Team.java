package ss14.exercise05;

import java.util.ArrayList;

public class Team extends AbstractTeam {

    // a)
    public Team() {
        this.members = new ArrayList<Player>();
    }

    // b)
    public Player[] getPlayers() {
        return (Player[]) this.members.toArray();
    }

    // c)
    public Player playerByName(String name) {
        for (Player p : this.members) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    // d)
    public boolean playerInTeam(String name) {
        return this.playerByName(name) != null;
    }

    // e)
    public void addPlayerToTeam(String name) throws IllegalArgumentException {
        if (this.playerInTeam(name)) {
            throw new IllegalArgumentException("Spieler bereits vorhanden");
        }

        this.members.add(new Player(name));
    }

    // f)
    public Player removePlayerFromTeam(String name) throws IllegalArgumentException {
        Player p = this.playerByName(name);
        if (p == null) {
            throw new IllegalArgumentException("Spieler nicht im Team");
        }

        this.members.remove(p);
        return p;
    }

    // g)
    public void substitutePlayer(String nameOfReplacedPlayer, String nameOfNewPlayer) throws IllegalArgumentException {
        try {
            this.removePlayerFromTeam(nameOfReplacedPlayer);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Auszuwechselnder Spieler nicht im Team");
        }

        try {
            this.addPlayerToTeam(nameOfNewPlayer);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Einzuwechselnder Spieler bereits im Team");
        }
    }
}
