public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};  // missing 4
        int n=9;
        int actualsum=0;
        int expectedsum=n*(n+1)/2;
        for(int num:arr){
            actualsum=actualsum+num;
        }
        int result= expectedsum-actualsum;
System.out.println("the answer is"+result);
    }
}
