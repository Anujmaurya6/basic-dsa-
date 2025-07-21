

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++){
           int minIndex=i;

           for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[minIndex]){
                minIndex=j;
            }
            int temp=arr[i];
            arr[i]=temp;
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
           }

           System.out.println("Selection Sort is:"+arr[i]);
 
       
           
        }
    
    }
}
    

