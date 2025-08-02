import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        // Step 1: Count digits
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Step 2: Calculate Armstrong sum
        int sum = 0;
        int temp2 = num;
        while (temp2 > 0) {
            int digit = temp2 % 10;
            sum += (int)Math.pow(digit, digits);  // 💡 digit^digits
            temp2 = temp2 / 10;
        }

        // Step 3: Compare
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }
    }
}
