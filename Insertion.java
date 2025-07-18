public class Insertion {
     public static void insertionSort(int[] arr) {
        int n = arr.length;
     
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>=key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

         // print final sorted array
        System.out.println("Array after insertion sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 2}; // input array
        insertionSort(arr);      // sort call
    }
}
