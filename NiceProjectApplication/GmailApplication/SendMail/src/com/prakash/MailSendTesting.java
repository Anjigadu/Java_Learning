package com.prakash;

//javax.mail
//this code sends mail using gmail smtp
//you may need javax.mail api to implement this code

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSendTesting {

	public static void main(String[] args) {
		try {
			String host = "smtp.gmail.com";
			String from = "mailme.prak@gmail.com";// your gmail account
			String pass = "*********";// your password of gmail account
			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			String[] to = { "archana.01.singh@gmail.com" };
			// receiver mail address can be other then gmail

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));

			InternetAddress[] toAddress = new InternetAddress[to.length];

			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}
			System.out.println(Message.RecipientType.TO);

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			message.setSubject("Java Mail!!!");// set subject of mail
			message.setText("Hi Archana, Prakash Ranjan here.. Sending mail from Java App");// set
																			// mail
																			// content
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
