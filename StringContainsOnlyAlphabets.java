public class StringContainsOnlyAlphabets {
    public static void main(String[] args) {
        
    
    String str="Helloworld";

    boolean isAlphabet=str.matches("[a-zA-Z]");

    System.out.println("Only Alphabets:"+isAlphabet);
}
}