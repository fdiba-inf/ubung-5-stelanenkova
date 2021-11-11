package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        // Find unique numbers in numbers
        numbers[0] = uniqueNumbers[0];

        for (int index = 0; index < numbers.length; index++) {
          for (int j = 0; j < numbers.length; j++) {
            if (uniqueNumbers[j] == numbers[index]) {
              break;
            } else if (uniqueNumbers[j] == 0) {
              uniqueNumbers[j] = numbers[index];
              break;
            }
          }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
