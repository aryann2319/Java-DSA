import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2="silents";
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            int k= mpp.getOrDefault(ch, 0);
            mpp.put(ch, k+1);
        }
        int count =0;
        for(int i=0; i<s2.length(); i++){
            char ch2 = s2.charAt(i);
            if(mpp.containsKey(ch2)){
                count++;
            }
        }
        if(count==s1.length()){
            System.out.println("Is Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
