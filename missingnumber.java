public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};  // missing 4

        int n = 9;  // last number of range, NOT length
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;
        System.out.println("The missing number is: " + missing);
    }
}
