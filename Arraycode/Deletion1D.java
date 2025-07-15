package Arraycode;

public class Deletion1D {
    public static void main(String[] args) {
        // Original array
        int[] arr = {10, 20, 30, 40};

        // Index jise delete karna hai
        int deleteIndex = 2;

        // Naya array banaya chhota size ka
        int[] newArr = new int[arr.length - 1];

        // i => newArr index, j => old array index
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (j == deleteIndex) {
                j++; // deleteIndex ko skip karo
            }
            newArr[i] = arr[j++]; // baaki elements copy karo
        }

        // Print result
        System.out.println("Array after deletion are:");
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}

