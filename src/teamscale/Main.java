package teamscale;

import teamscale.builder.TeamScaleBuilder;
import teamscale.model.Player;
import teamscale.model.PlayerStatus;
import teamscale.model.Team;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Vasco"));
        teams.add(new Team("Botafogo"));
        teams.add(new Team("Fluminense"));
        teams.add(new Team("Flamengo"));

        List<Player> players = new ArrayList<>();
        players.add(new Player("Felipe", PlayerStatus.MAIN));
        players.add(new Player("Rodrigo", PlayerStatus.MAIN));
        players.add(new Player("Lucas Tapparo", PlayerStatus.MAIN));
        players.add(new Player("Gilberto", PlayerStatus.MAIN));
        players.add(new Player("Renato", PlayerStatus.MAIN));
        players.add(new Player("Luciano", PlayerStatus.MAIN));
        players.add(new Player("Rafael", PlayerStatus.MAIN));
        players.add(new Player("Icaro", PlayerStatus.MAIN));
        players.add(new Player("Arthur", PlayerStatus.MAIN));
        players.add(new Player("João", PlayerStatus.MAIN));
        players.add(new Player("Otávio", PlayerStatus.MAIN));
        players.add(new Player("Diogo", PlayerStatus.MAIN));
        players.add(new Player("André", PlayerStatus.MAIN));
        players.add(new Player("Edmundo", PlayerStatus.MAIN));
        players.add(new Player("Bruna", PlayerStatus.MAIN));
        players.add(new Player("Amanda", PlayerStatus.MAIN));
        players.add(new Player("Julia", PlayerStatus.MAIN));
        players.add(new Player("Luna", PlayerStatus.MAIN));
        players.add(new Player("Sérgio", PlayerStatus.MAIN));
        players.add(new Player("Ribamar", PlayerStatus.MAIN));

        List<Team> teamBuilder = new TeamScaleBuilder()
                .teams(teams)
                .players(players)
                .build();

        System.out.println(teamBuilder);

    }
}
