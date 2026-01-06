package Workshop5;

public class Main1 {
    public static void main(String[] args) {

        Team team = new Team();
        System.out.println(team.getPlayers()[0].name);

        team = null; // players become inaccessible
    }
}
