package net.sample.gradle.client;

import net.sample.gradle.core.MessageService;
import org.apache.log4j.Logger;

/**
 * @author sample
 */
public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
