
import java.util.*;
public class DuplicatesArray {
    public static void main(String[] args) {

   
        String s = "programming";
        
        // Step 1: Convert to char array
        char[] chars = s.toCharArray();
        
        // Step 2: Use HashSet to track duplicates
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();
        
        // Step 3: Identify duplicates
        for (char c : chars) {
            if (!uniqueChars.add(c)) { // add() returns false if already present
                duplicateChars.add(c);
            }
        }
        
        // Step 4: Count and print duplicates
        for (char dup : duplicateChars) {
            int count = 0;
            for (char c : chars) {
                if (c == dup) count++;
            }
            System.out.println(dup + "=" + count);
        }
    }
}