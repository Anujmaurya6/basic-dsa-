package Arraycode;
public class Deletion1D {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int deleteIndex = 2;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("After deletion:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }
    }
}
