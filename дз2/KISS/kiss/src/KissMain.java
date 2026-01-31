public class KissMain {

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        processor.processNumbers(new int[]{1, -3, 5, 2});

        Divider divider = new Divider();
        System.out.println("Divide result: " + divider.divide(10, 2));
    }
}