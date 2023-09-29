public class Arrays {
    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 345, 676, 343, 874, 324};
        /*
        //print the array//
        for (i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        //print the values > 300//
        for (i = 0; i < nums.length; i++){
            if (nums[i]> 300){
                System.out.println(nums[i]);
            }
        }
         */
        //count the number of indexes
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 320) {
                count++;
            }
        }
        System.out.println(count);
    }
}
