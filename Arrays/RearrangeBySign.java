public class RearrangeBySign {
    public static void main(String[] args) {
        // Move all negative numbers to beginning and positive to end
        int[] arr = {1, 2, 3, -4, -1, 4};

        // using temp array
        // int[] temp = new int[arr.length];
        // int k=0;
        // for (int idx = 0; idx < arr.length; idx++) {
        //     if(arr[idx]<0){
        //         temp[k++]=arr[idx];
        //     }
        // }
        // for (int idx = 0; idx < arr.length; idx++) {
        //     if(arr[idx]>0){
        //         temp[k++]=arr[idx];
        //     }
        // }
        // for (int idx = 0; idx < temp.length; idx++) {
        //     System.out.print(temp[idx] + " ");
        // }

        // two pointers
        int left =0;
        int right= arr.length-1;
        while(left<=right){
            if(arr[left]>0 && arr[right]>0){
                right--;
            }
            else if(arr[left]>0 && arr[right]<0){
                int ele=arr[left];
                arr[left]=arr[right];
                arr[right]=ele;
                left++;
                right--;
            }
            else if(arr[left]<0 && arr[right]<0){
                left--;
            }
            else{
                left--;
                right++;
            }
        }
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
