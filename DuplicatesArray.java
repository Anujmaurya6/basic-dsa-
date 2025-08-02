

public class DuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int [] arr2={7,8,9,10};

        int[] merged=new int[arr.length+arr2.length];

        for(int i=0;i<arr.length;i++){
            merged[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            merged[arr.length+i]=arr2[i];
        }
    }
    }