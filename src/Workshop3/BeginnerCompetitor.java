package Workshop3;

public class BeginnerCompetitor extends XXXCompetitor {
    public BeginnerCompetitor(int id, Name name, String country) {
        super(id, name, "Beginner", country);
    }

    @Override
    public double getOverallScore() {
        return 60;
    }
}
