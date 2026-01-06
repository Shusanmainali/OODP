package Workshop6;

public class NotificationService {

    public boolean sendEmail(String email, String message) {
        return email != null && email.contains("@");
    }
}
