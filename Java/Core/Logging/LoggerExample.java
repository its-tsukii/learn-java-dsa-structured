package Java.Core.Logging;

import java.util.logging.*;

public class LoggerExample {
    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    public static void main(String[] args) {
        logger.info("Application Started");
        try {
            int result = divide(10, 0);
            logger.info("Result is : " + result);
        } catch (ArithmeticException e) {
            logger.severe("Exception occured : " + e.getMessage());
        }
        logger.warning("This is a warning message.");
        logger.info("Application finished.");
        logger.log(Level.CONFIG, "config, fine does not appear as they are only for internal logic ");
        logger.log(Level.FINE, "Terminated");
        logger.setLevel(Level.OFF);
        logger.log(Level.INFO, "Setting the level off so this does not appear");
        logger.log(Level.ALL, " this is the message");
    }

    public static int divide(int a, int b) {
        logger.log(Level.INFO, "FROM METHOD DIVIDE");
        return a / b;
    }
}
