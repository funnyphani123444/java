import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] nums={8,3,4,12,5,6};
        nums=mergesort(nums);
        System.out.print(Arrays.toString(nums));
    }
    static int[] mergesort(int[] nums){
        if(nums.length==1)
        return nums;

        int mid=nums.length/2;
        int[] left=mergesort(Arrays.copyOfRange(nums, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left,right);
        
    }
    private static int[] merge(int[] left, int[] right) {
       int[] nums=new int[left.length+right.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<left.length&&j<right.length)
       {
        if(left[i]<right[j]){
        nums[k]=left[i];
        i++;
        }
        else{
        nums[k]=right[j];
        j++;
        }
        k++;
       }
       while(k<nums.length){
       //while(i<left.length){
       if(i!=left.length){
           nums[k]=left[i];
            i++;
            k++;
       }
       //while(j<right.length){
        if(j!=right.length){
            nums[k]=right[j];
            j++;
            k++;
       }
    }
       return nums;
    }
}
