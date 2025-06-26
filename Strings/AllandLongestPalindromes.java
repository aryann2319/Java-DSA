import java.util.*;

public class AllandLongestPalindromes {
    public static void main(String[] args) {
        String str = "radarcbca";
        // brute force approach 
        List<String> strlist = new ArrayList<>();
        int count=0, len=0;
        String strlong="";
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                strlist.add(str.substring(i,j+1));
            }
        }
        for(String s: strlist){
            if(s.equals(new StringBuilder(s).reverse().toString())){
                if(s.length()>len){
                    len=s.length();
                    strlong=s;
                }
                count++;
                System.out.println(s);
            }
        }
        System.out.println("Total palindromes are: "+ count);
        System.out.println("Longest palindrome length is: " + len + " (" + strlong + ")");

        // optimized approach for counting all palindromes (counting odd length and even length palindromes)
    //     int count=0;
    //     for(int i=0; i<str.length(); i++){
    //         count+=countPalindrome(str, i, i);
    //         count+=countPalindrome(str, i, i+1);

    //     }
    //     System.out.println(count);
    // }
    // static int countPalindrome(String s, int left, int right){
    //     int count=0;
    //     while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
    //         count++;
    //         left--;
    //         right++;
    //     }
    //     return count;
    }
}
