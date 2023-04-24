import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        File fileOfNumbers = new File("src/numbers.txt");

        try {
            int[] numbers = DataHandling.readNumbersFromFile(fileOfNumbers);
            int sumOfNumbers = DataHandling.sumOfArrayNumbers(numbers);
            System.out.println(Arrays.toString(numbers));
            System.out.println(sumOfNumbers);
        } catch (InvalidNumberException e) {
            System.out.println("Invalid Number" + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found" + e.getMessage());
        }

    }
}