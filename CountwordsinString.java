public class CountwordsinString {
   
    public static int countWords(String str) {  // Need a method to return int
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String trimmed = str.trim();
        return trimmed.split("\\s+").length;
    }

    public static void main(String[] args) {
        String testString = "Hello   World  Java";
        System.out.println("Word count: " + countWords(testString));  // Output: 3
    }
}
