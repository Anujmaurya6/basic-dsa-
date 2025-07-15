package Arraycode;

import java.util.Scanner;

public class Userdeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size from user
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Take elements input
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Ask for index to delete
        System.out.println("Enter the index of element you want to delete:");
        int delIndex = sc.nextInt();

        // Index validation
        if (delIndex < 0 || delIndex >= size) {
            System.out.println("Invalid index! Deletion not possible.");
            return;
        }

        // Create new array and copy all except the one at delIndex
        int[] newArr = new int[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i == delIndex) continue;
            newArr[j++] = arr[i];
        }

        // Print result
        System.out.println("Array after deletion:");
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}
