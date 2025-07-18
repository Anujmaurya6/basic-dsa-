

public class SelectionSort {
    public static void selectionSort(int[] arr) {
   
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int minIndex=i;
        
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }
        }
int temp=arr[i];
arr[i]=arr[minIndex];
arr[minIndex]=temp;

    }    
        for(int num:arr){
            System.out.println("the array after selectionsorting is:"+num);
        }
    }
    public static void main(String[] args) {
             int [] arr={43,54,65,76,87,98,31};
            selectionSort(arr);
    } 
    }
    

