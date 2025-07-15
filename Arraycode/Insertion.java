package Arraycode;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int insertionpos=2;
        int value=69;

        int[] newArray=new int[arr.length+1];

        for(int i=0,j=0;i<newArray.length;i++){
            if(i==insertionpos){
                newArray[i]=value;
            }else{
                newArray[i]=arr[j++];
            }
        }
        for(int num : newArray){
        System.out.println("your array after insertion are"+num);

}  }
}

