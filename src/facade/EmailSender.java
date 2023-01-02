package facade;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class EmailSender {

    private EmailSettings settings;

    public EmailSender(EmailSettings settings) {
        this.settings = settings;
    }

    public void sendEmail(EmailMessage message){
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", settings.getHost());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(message.getFrom()));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getTo()));
            msg.setSubject(message.getSubject());
            msg.setText(message.getText());

            Transport.send(msg);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
