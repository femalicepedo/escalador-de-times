package teamscale.builder;

import teamscale.model.Player;
import teamscale.model.Team;

import java.util.*;
import java.util.stream.Collectors;

public class TeamScaleBuilder {
    private List<Team> teams;
    private List<Player> players;

    public TeamScaleBuilder() {
    }

    private TeamScaleBuilder(List<Team> teams, List<Player> players) {
        this.teams = teams;
        this.players = players;
    }

    public TeamScaleBuilder teams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public TeamScaleBuilder players(List<Player> players) {
        this.players = players;
        return this;
    }

    public List<Team> build() {
        return new TeamScaleBuilder(teams, players).scalePlayersIntoTeams();
    }

    private List<Team> scalePlayersIntoTeams() {
        Objects.requireNonNull(teams);
        Objects.requireNonNull(players);
        Collections.shuffle(players);

        Deque<Player> playerDeque = new ArrayDeque<>(players);

        return teams.stream().map(team -> team.scale(teams.size(), playerDeque)).collect(Collectors.toList());
    }
}
