public class LoggingService {

    public void log(String message) {
        String connectionString = AppConfig.CONNECTION_STRING;
        System.out.println("Logging with: " + connectionString);
        System.out.println("Message: " + message);
    }

}