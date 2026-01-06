package Workshop3;

import java.util.List;

public class XXXCompetitor {

    private final int competitorID;   // Q6: final
    private Name name;
    private String level;
    private String country;

    public XXXCompetitor(int competitorID, Name name, String level, String country) {
        if (competitorID < 0) {
            throw new IllegalArgumentException("Competitor ID cannot be negative");
        }
        this.competitorID = competitorID;
        this.name = name;
        setLevel(level);
        this.country = country;
    }

    public int getCompetitorID() {
        return competitorID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    // Q2: Validation
    public void setLevel(String level) {
        if (level.equals("Beginner") || level.equals("Intermediate") || level.equals("Advanced")) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("Invalid level");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Q4 Polymorphic method
    public double getOverallScore() {
        return 0;
    }

    // Method Overloading
    public double getOverallScore(List<Integer> scores) {
        int sum = 0;
        for (int s : scores) sum += s;
        return sum / (double) scores.size();
    }

    public double getOverallScore(List<Integer> scores, double weight) {
        return getOverallScore(scores) * weight;
    }

    public String getFullDetails() {
        return competitorID + " - " + name.getFirstName() + " " + name.getLastName() +
               " (" + level + ")";
    }
}

