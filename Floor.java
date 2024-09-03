
public class Floor {

    public static void main(String[] args){
        int[] nums={2,3,5,9,14,16,18};
        int target=20;
        int index=floor(nums, target);
        System.out.print(index);
    }
    static int floor(int[] nums,int target){
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
        return end;
        
    }
}
