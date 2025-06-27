import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1= "hello";
        String s2= "world";
        boolean[] arr = new boolean[256];
        Arrays.fill(arr, false);
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)-'a']=true;
        }
        for(int i=0; i<s2.length(); i++){
            if(arr[s2.charAt(i)-'a']){
                System.out.println("True");
            }
        }
    }
}
