package Arraycode.coding;

import java.util.Arrays;
public class Anagramcheck {
    public static void main(String[] args) {
        String str="listen";
        String str2="silent";

        char[] c1=str.toCharArray();
        char[] c2=str.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }

    }
}
