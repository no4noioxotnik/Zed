package meat;

import javax.mail.MessagingException;

public interface SendMail2 {
    void sendMessageWithAttachment(
            String to, String subject, String text, String pathToAttachment) throws MessagingException;
}
