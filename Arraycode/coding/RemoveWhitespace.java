package Arraycode.coding;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Hello   World";

        // replaceAll() use karo for regex-based replacement
        String result = str.replaceAll("\\s+", ""); // Remove all whitespace

        System.out.println("Without space: " + result);
    }
}
