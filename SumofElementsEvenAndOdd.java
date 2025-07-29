public class SumofElementsEvenAndOdd {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<=arr.length;i++){
            if(arr[i]%2==0){
                evenSum=evenSum+=arr[i];
            }else{
                oddSum=oddSum+=arr[i];
            }
            System.out.println("Even Index sum"+evenSum);
            System.out.println("even Index sum"+oddSum);
        }
    }
    
}
