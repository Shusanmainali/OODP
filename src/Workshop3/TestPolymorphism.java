package Workshop3;

public class TestPolymorphism {
    public static void main(String[] args) {

        XXXCompetitor c = new AdvancedCompetitor(
                101,
                new Name("Sushant", "Mainali"),
                "Nepal"
        );

        System.out.println(c.getOverallScore()); // Calls Advanced version
    }
}

