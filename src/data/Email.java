package data;

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class Email {
    private static String email;

    public static void setEmail(String email) {
        Email.email = email;
    }   

    public static void enviar(String htmlBody,Map<String, String> mapInlineImages)throws AddressException, MessagingException {
        String username = "onthecodex@gmail.com";
        String senha = "Rog3rinOTC_123";
        
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.auth", "true");
        properties.put("mail.user", username);
        properties.put("mail.password", senha);
 
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, senha);
            }
        };
        Session session = Session.getInstance(properties, auth);
 
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(username));
        InternetAddress[] toAddresses = { new InternetAddress(email) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject("OTC - Código de Recuperação");
        msg.setSentDate(new Date());
 
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(htmlBody, "text/html;charset=UTF-8");
 
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
 
        if (mapInlineImages != null && mapInlineImages.size() > 0) {
            Set<String> setImageID = mapInlineImages.keySet();
             
            for (String contentId : setImageID) {
                MimeBodyPart imagePart = new MimeBodyPart();
                imagePart.setHeader("Content-ID", "<" + contentId + ">");
                imagePart.setDisposition(MimeBodyPart.INLINE);
                 
                String imageFilePath = mapInlineImages.get(contentId);
                try {
                    imagePart.attachFile(imageFilePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
 
                multipart.addBodyPart(imagePart);
            }
        }
 
        msg.setContent(multipart);
 
        Transport.send(msg);
    }
}