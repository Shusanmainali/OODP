package Workshop3;

public class AdvancedCompetitor extends XXXCompetitor {
    public AdvancedCompetitor(int id, Name name, String country) {
        super(id, name, "Advanced", country);
    }

    @Override
    public double getOverallScore() {
        return 90;
    }

    public void extraTraining() {
        System.out.println("Advanced extra training session");
    }
}

