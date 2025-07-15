package Arraycode;


import java.util.Scanner;

public class Userupdation {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of elements:");
int size=sc.nextInt();


int []newArr=new int[size];

System.out.println("Enter the no of elements:");
for(int i=0;i<size;i++){
newArr[i]=sc.nextInt();
}
System.out.println("Which element of index you have to be updated:");
int newpos=sc.nextInt();

System.out.println("Enter the value :");
int value=sc.nextInt();

newArr[newpos]=value;

System.out.println("Updation ke baad array:");
        for (int i = 0; i < size; i++) {
            System.out.print(newArr[i] + " ");
        }
}
}
