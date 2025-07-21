import java.util.*;
public class CommonCharacter {
    public static void main(String[] args) {
        String str1="hello";
        String str2="world";

        Set<Character> set1=new HashSet<>();
        for(char c:str1.toCharArray()){
            set1.add(c);
        }
        System.out.println("Common characters:");
        //check each character of second string
        for(char c:str2.toCharArray()){
            if(set1.contains(c)){
                System.out.println(c+"");
            }
        }
    }
    
}
