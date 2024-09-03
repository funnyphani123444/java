public class SortedRec {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,7,6,10};
        System.out.println(isSorted(nums, 0));
    }
    public static boolean isSorted(int[] nums,int i){
        if(i==nums.length-1)
        return true;
        return nums[i]<nums[i+1]&&isSorted(nums, i+1);
    }
}
