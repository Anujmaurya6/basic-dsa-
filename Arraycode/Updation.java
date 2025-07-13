package Arraycode;
//mujhe arrray ko updare karn ahe idhar 
public class Updation {

public static void main(String[] args) {
    int[] arr={23,4,45,66,89,87,45};
    int updateindex=3;
    int newvalue=222;

    arr[updateindex]=newvalue;
    
    System.out.println("after the updation");
for(int num:arr){
    System.out.println(num+"");
}
}

}
