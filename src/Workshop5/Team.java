package Workshop5;

public class Team {

    private Player[] players;

    public Team() {
        players = new Player[] {
            new Player("Ram"),
            new Player("Shyam")
        };
    }

    public Player[] getPlayers() {
        return players;
    }
}
