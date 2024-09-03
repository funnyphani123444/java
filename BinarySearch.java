
public class BinarySearch {

    public static void main(String[] args){
        int[] nums={4,5,6,7,90,100,101};
        int target=100;
        int low=0;
        int high=nums.length-1;
        //System.out.println(high);
        int index=binarySearchR(nums, target,low,high);
        System.out.print(index);
    }
    static int binarySearch(int[] nums,int target){
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
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
        
    }
    static int binarySearchR(int[] nums,int target,int low,int high){
        if(low>high)
        return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]>target){
            high=mid-1;
            return binarySearchR(nums, target,low,high);
        }
        else if(nums[mid]<target)
        {
            low=mid+1;
            return binarySearchR(nums, target, low, high);
        }
        else
        return mid;
    }        
}
