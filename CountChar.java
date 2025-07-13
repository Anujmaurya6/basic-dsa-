import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();

    //int count=str.length();
     //System.out.println("the length of total characters is"+count);
int count = str.replace(" ", "").length();
System.out.println("Characters (excluding spaces): " + count);

    }
}
