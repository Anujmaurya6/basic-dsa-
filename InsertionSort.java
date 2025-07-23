public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={23,34,45,56,4,33,2,21,11,23,49};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
        
        while(j>=0 && arr[j]>current){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
    }

    System.out.println("Sorted Array is:");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
}
}
