package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];
        int temp;

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        // Sort numbers in ascending order

        for (int index = 0; index < numbers.length; index++) {
          for (int j = 0; j < numbers.length -1; j++){
            if (numbers[j] > numbers[j+1]){
              temp = numbers[j];
              numbers[j] = numbers[j+1];
              numbers[j+1] = temp;
            }

          }
        }
  
        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
