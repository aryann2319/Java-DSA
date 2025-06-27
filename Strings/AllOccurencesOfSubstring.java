public class AllOccurencesOfSubstring {
    public static void main(String[] args) {
        String str="HelloWorldHello";
        String substr="Hello";

        int index = str.indexOf(substr);
        while (index != -1){
            System.out.println("Present at index: " + index);
            index = str.indexOf(substr, index + 1);
        }

        // using for loop
        String str = "ababcabcab";
        String substr = "abc";

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            boolean match = true;

            for (int j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                System.out.println("Found at index: " + i);
                i=i+j;
            }
        }
    }
}
