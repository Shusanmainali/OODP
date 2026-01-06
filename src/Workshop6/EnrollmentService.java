package Workshop6;

import java.util.HashSet;
import java.util.Set;

public class EnrollmentService {

    private Set<String> enrollments = new HashSet<>();

    public boolean enrollStudent(String student, String course) {
        String key = student + "-" + course;
        if (enrollments.contains(key)) {
            return false;
        }
        enrollments.add(key);
        return true;
    }
}

