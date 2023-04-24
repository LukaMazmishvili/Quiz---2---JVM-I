import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataHandling {

    private DataHandling() {

    }

    public static int[] readNumbersFromFile(File file) throws FileNotFoundException, InvalidNumberException {
        int[] numbers = new int[10];
        int index = 0;

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextInt() && index < 10) {
            try {
                int number = Integer.parseInt(scanner.next());
                if (number < 0) {
                    throw new InvalidNumberException("Negative Number ( " + number + " )");
                }

                numbers[index++] = number;

            } catch (NumberFormatException msg) {
                throw new NumberFormatException("Invalid Number");
            }
        }

        scanner.close();

        return numbers;
    }

    public static int sumOfArrayNumbers(int[] arrayOfNumbers) throws ArithmeticException {

        int sum = 0;

        for (int i : arrayOfNumbers) {
            sum += i;
        }
        if (sum == 0) {
            throw new ArithmeticException("Sum of array elements is zero");
        }

        return sum;
    }
}
