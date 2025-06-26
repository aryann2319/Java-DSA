public class CheckPalindrome {
    public static void main(String[] args) {
        String str= "racecar";
        String s="";
        for(int i=str.length()-1; i>=0; i--){
            s= s + (str.charAt(i));
        }
        if(s.equals(str)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
