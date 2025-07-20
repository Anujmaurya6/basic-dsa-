public class Missingnumber {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6};
        int n=6;
        
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
    System.out.println("Missing number is:"+sum);


    }
}
