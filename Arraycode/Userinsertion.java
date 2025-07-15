package Arraycode;

import java.util.Scanner;

public class Userinsertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();

        int[] newArr=new int[size];
        System.out.println("enter the elements name:");
        for(int i=0;i<size;i++){
            newArr[i]=sc.nextInt();
        }
      System.out.println("Enter the position:");
      int pos=sc.nextInt();

      System.out.println("enter the value:");
      int value=sc.nextInt();
        int[] newArray=new int[newArr.length+1];

        for(int i=0,j=0;i<newArray.length;i++){
            if(i==pos){
                newArray[i]=value;
            }else{
                newArray[i]=newArr[j++];
            }
        }
        for(int num : newArray){
       
   for(int i=0;i<size;i++){
     System.out.println("your array after insertion are"+num);
}  }
    
    }}
