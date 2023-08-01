import java.util.logging.Logger;

public class LogPractice {
    public static void main(String[] args) {
        Logger LoggerFactory = null;
        final Logger logger = LoggerFactory.getLogger(LogPractice.class.getName());
        logger.info("Hello world!");
    }
}