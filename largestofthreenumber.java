public class largestofthreenumber {
    public static void main(String[] args) {
        int a=56;
        int b=34;
        int c=78;

        if(a>b && a>c){
            System.out.println("the number in variable a is largest:"+a);
        }else if(b>a && b>c){
            System.out.println("The number in varible b is largest:"+b);
        }else if(c>a && c>b){
            System.out.println("the number is variable c is largest:"+c);
        }
        else{
            System.out.println("The number all three are equal");
        }
    }
}
