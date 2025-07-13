import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the STring:");
        String str=sc.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("the string is palindrome:");
        }else{
            System.out.println("the String is not palindrome");
        }
    }
    
}
