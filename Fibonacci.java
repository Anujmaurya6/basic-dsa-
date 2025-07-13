public class Fibonacci {
    static int Fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int num=19;
        int result=Fibonacci(num);
        System.out.println("the fibonacci is the "+num+"are");
        for(int i=0;i<num;i++){
                System.out.print(Fibonacci(i) + " ");
    }
    }
}
