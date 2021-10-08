package teamscale.model;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Team {
    private final String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Team scale(int size, Deque<Player> players) {
        for (int i = 0; i < size; i++) {
            this.players.add(players.poll());
        }

        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                '}';
    }
}
