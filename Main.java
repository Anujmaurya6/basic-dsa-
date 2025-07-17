
public class Main{
public static void main(String[] args) {
String str="Anuj";
int i=0;
int j=3;

StringBuilder sb=new StringBuilder(str);

//swap karna
char temp=sb.charAt(i);
sb.setCharAt(i,sb.charAt(j));
sb.setCharAt(i, temp);

System.out.println("after swap"+sb.toString());
}
}
    