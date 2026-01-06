package Workshop3;

public class IntermediateCompetitor extends XXXCompetitor {
    public IntermediateCompetitor(int id, Name name, String country) {
        super(id, name, "Intermediate", country);
    }

    @Override
    public double getOverallScore() {
        return 75;
    }
}
