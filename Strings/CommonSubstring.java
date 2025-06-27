import java.util.*;

public class CommonSubstrings {
    public static void main(String[] args) {
        String str1 = "abcab";
        String str2 = "cabca";

        Set<String> substrings1 = new HashSet<>();
        Set<String> substrings2 = new HashSet<>();

        // Generate all substrings of str1
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                substrings1.add(str1.substring(i, j));
            }
        }

        // Generate all substrings of str2
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i + 1; j <= str2.length(); j++) {
                substrings2.add(str2.substring(i, j));
            }
        }

        // Retain only common substrings
        substrings1.retainAll(substrings2);

        System.out.println("Common substrings:");
        for (String s : substrings1) {
            System.out.println(s);
        }

        // Find the longest one from common substrings
        String longest = "";
        for (String s : substrings1) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println(longest);
    }
}
