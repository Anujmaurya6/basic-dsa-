public class CountEvenOdd {
    public static void main(String[] args) {
    
    int [] arr={3,2,1,4,5,6,7,8,9};
    int evencount=0;
    int oddcount=0;

    for(int num:arr){
        if(num%2==0){
            evencount++;
    
        }else{
            oddcount++;
  
        }
    }
    System.out.println("the number is even number"+evencount);
              System.out.println("the number is odd number"+oddcount);
    }}