package Question4;

public enum NotificationService {
    INSTANCE;

    void sendAlert(String message){
        System.out.println("ALERT:" + message);
    }
}
