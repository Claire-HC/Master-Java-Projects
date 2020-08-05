package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        footballLeague.add(adelaideCrows);
        //footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();
    }
}
