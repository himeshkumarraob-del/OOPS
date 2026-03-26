class Notifier {
    public void send(String message) {
        System.out.println("General Alert: " + message);
    }

    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

    private void logInternal() {
        System.out.println("System Log: Internal notification process executed.");
    }

    public void triggerInternalLog() {
        logInternal();
    }
}

class AppNotifier extends Notifier {
    public void testAccessibility() {
        send("Hello via Public");
        send("Hello via Protected", "user@example.com");
        send("Hello via Default", 9876543210L);
        // send("Private", "Secret"); // This would cause a compile-time error
        System.out.println("Private methods are not directly accessible here.");
    }
}

public class NotificationTest {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.testAccessibility();
        app.triggerInternalLog();
    }
}