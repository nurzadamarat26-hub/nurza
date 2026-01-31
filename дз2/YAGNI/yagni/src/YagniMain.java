public class YagniMain {

    public static void main(String[] args) {
        User user = new User("Danial", "danial@mail.com");
        System.out.println(user.getName() + " - " + user.getEmail());

        ReportGenerator report = new ReportGenerator();
        report.generatePdfReport();
    }
}