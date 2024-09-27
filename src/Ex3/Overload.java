package Ex3;

public class Overload {

        public static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        public static double calculateAverage(double[] numbers) {
            int sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        public static String concatenateStrings(String[] strings) {
            StringBuilder result = new StringBuilder();
            for (String str : strings) {
                result.append(str).append(" ");
            }
            return result.toString();
       }
}
