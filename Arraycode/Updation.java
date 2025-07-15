package Arraycode;
//mujhe arrray ko updare karn ahe idhar 
public class Updation {

public static void main(String[] args) {
    int[] arr={23,4,45,66,89,87,45};
    int updateindex=2;
    int value=69;
 arr[updateindex]=value;

 for(int i=0;i<arr.length;i++){
    System.out.println("after updation array are:"+arr[i]);
 }
}

}
