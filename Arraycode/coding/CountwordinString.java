package Arraycode.coding;

public class CountwordinString {
    public static void main(String[] args) {
        String str="Hey I am Anuj Maurya.";
        String [] words=str.trim().split("\\s+");
        System.out.println("Word count:"+words.length);
    }
}
