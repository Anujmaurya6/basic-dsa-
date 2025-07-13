package Arraycode;

public class Insertion {
public class Insertion1D {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int insertPos = 2;
        int value = 99;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == insertPos) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }

        System.out.println("After insertion:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }
    }
}  
}
