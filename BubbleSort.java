
public class BubbleSort {

 public static void main(String[] args) {
int[] arr={64,24,34,5,32,98};
int n=arr.length;

System.out.println("Original Array:");
for(int num:arr){
    System.out.println(" "+num);
}
System.out.println();


for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
}
 }
 for(int num:arr){
    System.out.println("after bublle sorting it we get:"+num);
 }
}
}