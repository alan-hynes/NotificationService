package ie.atu.notificationservice;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(NotificationRequest request) {
        System.out.println("Sending notification to " + request.getRecipient() + ": " + request.getMessage());

    }
}
