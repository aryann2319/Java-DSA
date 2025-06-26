import java.util.Arrays;

public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,2,3,5};
        int target = 9;

        // brute-force
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1;j<arr.length; j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i] + " " + arr[j]);
        //         }
        //     }
        // }

        // better-approach(using hashing)
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        //     int moreneeded = target-arr[i];
        //     if(mpp.containsKey(moreneeded)){
        //         System.out.println(arr[mpp.get(moreneeded)] + " " + arr[i]);
        //     }
        //     mpp.put(arr[i], i);
        // }

        // optimal approach(using two pointers)- works only on sorted arrays
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);
                break;
            }
            else if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
        }
    }
}