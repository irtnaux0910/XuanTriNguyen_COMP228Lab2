package Ex3;

import static Ex3.Overload.*;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"one", "two", "three", "four", "five"};

        int sum = calculateSum(intArray);
        double average = calculateAverage(doubleArray);
        String concatenated = concatenateStrings(stringArray);

        System.out.println("Sum of integers: " + sum);
        System.out.println("Average of doubles: " + average);
        System.out.println("Concatenated strings: " + concatenated);
    }
}
