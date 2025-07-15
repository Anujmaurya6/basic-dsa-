package Arraycode.TWOD;

public class insertion {
    public static void main(String[] args) {
        // Hardcoded 2D array (3x3)
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Traversal: row by row, column by column
        System.out.println("Traversing the matrix:");
        for (int i = 0; i < matrix.length; i++) {                // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {         // Loop through columns in each row
                System.out.println("Element at [" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}

