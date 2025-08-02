import java.util.Arrays;

public class AnagramCheck {


    public static boolean isAnagram(String str1, String str2) {
        // Step 1: Clean both strings (lowercase + remove spaces)
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 3: Convert to char arrays and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram hain ✅");
        } else {
            System.out.println("Anagram nahi hain ❌");
        }
    }
}

}
