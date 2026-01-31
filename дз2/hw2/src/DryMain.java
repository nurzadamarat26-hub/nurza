public class DryMain {

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("INFO", "DRY example started");

        DatabaseService db = new DatabaseService();
        db.connect();

        LoggingService logService = new LoggingService();
        logService.log("User logged in");
    }
}
