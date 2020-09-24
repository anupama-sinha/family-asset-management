package com.anupama.assets.schedulers;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
/*public class GreetingMessage {
    
    Logger logger = LoggerFactory.getLogger(GreetingMessage.class);

    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "SID";
    public static final String AUTH_TOKEN  = "AUTH";

    // Create a phone number in the Twilio console
    public static final String TWILIO_NUMBER = "";

    @Scheduled(cron = "${cron.expression}")
    public void deleteDuplicateMembers() throws Exception {
        //Pending Integration
        logger.info("Sending Email, SMS & WatsApp Greetings message to Family");

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber(""),
                new PhoneNumber(TWILIO_NUMBER),
                "Good Morning!!!")
                .create();
    }
}*/
