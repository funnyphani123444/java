public class Ceiling {

    public static void main(String[] args){
        int[] nums={2,3,5,9,14,16,18};
        int target=20;
        int index=ceiling(nums, target);
        System.out.print(index);
    }
    static int ceiling(int[] nums,int target){
        if(target>nums[nums.length-1])
        return -1;
        int start=0;
        int end= nums.length-1;
        //int mids=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target== nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
                //mids=mid;
            }
            else
            {
                end=mid-1;
                //mids=mid;
            }
        }
        return start;
        
    }
}
