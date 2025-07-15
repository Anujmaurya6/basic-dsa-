package Arraycode;

import java.util.Scanner;

public class Usertraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Array size input
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // Step 2: Array declaration
        int[] newArr = new int[size];

        // Step 3: Take elements input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            newArr[i] = sc.nextInt();
        }

        // Step 4: Traversal - print array
        System.out.println("Your traversed array is:");
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}
