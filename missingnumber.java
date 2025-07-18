

public class missingnumber {
    public static void main(String[] args) {
        int []arr={1,2,3,5,6};
        int n=arr.length;

        int totalsum=n*(n+1)/2;

        int arraySum=0;
        for(int num:arr){
            arraySum=arraySum+num;
        }
        int missing=totalsum-arraySum;
        System.out.println("the missing number in the array is:"+missing);
    }
}
