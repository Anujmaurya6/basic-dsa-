public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;

        // Outer loop for rows
        for (int line = 1; line <= n; line++) {
            int num = 1;

            // Print spaces for alignment (left padding)
            for (int j = 0; j < n - line; j++) {
                System.out.print(" ");
            }

            // Print numbers using binomial coefficient
            for (int i = 1; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / i; // Update number
            }

            // Move to next line
            System.out.println();
        }
    }
}