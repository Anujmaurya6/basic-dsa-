package Arraycode.coding;


import java.util.Scanner; 
public class Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of elements:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("apna array bhar bhai i mean elements ka name de buddy:");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }

        //kitni baar rotation lena he user se yeh bhi batade bhai
        System.out.println("how many time want to rotate an array");
        int k=sc.nextInt();

        k=k%n;

         // Rotation logic (right rotate k times)
        for (int r = 0; r < k; r++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        // Output
        System.out.print("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}