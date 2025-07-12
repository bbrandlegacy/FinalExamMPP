package Question4;

public class main {
    public static void main(String[] args) {
        NotificationService ward = NotificationService.INSTANCE;
        ward.sendAlert("Emergency in Ward 7!");

    }
}
