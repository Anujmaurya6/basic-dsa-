public class SelectionSort {
    public static void main(String[] args) {
int [] arr={23,34,45,4,33,2,21,11,12,23};


for(int i=0;i<arr.length;i++){
    int minIndex=i;

    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[minIndex]){
            minIndex=j;
        }
    }
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }

    System.out.println("Sorted array are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
}