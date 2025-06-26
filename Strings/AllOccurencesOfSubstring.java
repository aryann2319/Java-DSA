public class AllOccurencesOfSubstring {
    public static void main(String[] args) {
        String str="HelloWorldHello";
        String substr="Hello";

        int index = str.indexOf(substr);
        while (index != -1){
            System.out.println("Present at index: " + index);
            index = str.indexOf(substr, index + 1);
        }
    }
}
