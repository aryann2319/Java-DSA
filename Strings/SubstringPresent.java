public class SubstringPresent {
    public static void main(String[] args) {
        // checks if a substring is present or not and prints the first occurence
        String str="HelloWorld";
        String substr="World";

        // Using java methods
        // if(str.contains(substr)){
        //     System.out.println("Present at index: " + str.indexOf(substr));
        // }
        // else{
        //     System.out.println("Not present");
        // }

        //checking using for loop
        boolean found= false;
        for(int i=0; i<=str.length()-substr.length(); i++){
            int j;
            for(j=0; j<substr.length(); j++){
                if(str.charAt(i+j)!=substr.charAt(j)){
                    break;
                }
            }
            if(j==substr.length()){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Subtring present");
        }
        else{
            System.out.println("Not present");
        }
    }
}
