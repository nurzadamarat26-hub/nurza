public class NumberProcessor {

    public void processNumbers(int[] numbers) {
        if (numbers == null) return;

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

}