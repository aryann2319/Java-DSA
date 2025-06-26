import java.util.*;

public class FreqOfChars {
    public static void main(String[] args) {
        //find frequency of every char in string
        String s = "Placement";

        // brute force approach
        // int freq[] =new int[256];
        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)]++;
        // }
        // for(int i=0; i<256; i++){
        //     if(freq[i]>0){
        //         System.out.println((char)i+"->"+freq[i]);
        //     }
        // }

        //using hashmap
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int k= mpp.getOrDefault(ch, 0);
            mpp.put(ch, k+1);
        }
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
