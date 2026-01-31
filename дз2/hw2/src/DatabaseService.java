public class DatabaseService {

    public void connect() {
        String connectionString = AppConfig.CONNECTION_STRING;
        System.out.println("Connecting using: " + connectionString);
    }

}