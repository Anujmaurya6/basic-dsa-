public class Secondlargest {
    public static void main(String[] args) {
        int [] arr={5,4,7,8,9,2,3};
        
    int largest=Integer.MIN_VALUE;
    int secondlargest=Integer.MIN_VALUE;

    for(int num:arr){
        if(num>largest){
            secondlargest=largest;
            largest=num;
        }else if(num >secondlargest && num!=largest){
        secondlargest=num;
        }
        
    }
    if(secondlargest==Integer.MIN_VALUE){
    System.out.println("no second largest value is found:");
    }else{
        System.out.println("the second largest element is:"+secondlargest);
    
    }}
}