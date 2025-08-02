public class RecursiveBubbleSort {
    static void bubblesort(int[]arr,int n){
        if(n==1) return ;
        
        for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        }
        bubblesort(arr, n-1);//baaki bacha hua recursively sort karo ok 
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        bubblesort(arr, arr.length);
        System.out.println("Sorted array using recursion bubble sort:");
        for(int num:arr){
            System.out.println(" "+num);
        }
    }
}
