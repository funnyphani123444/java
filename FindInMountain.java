public class FindInMountain {
    
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,3,1};
        int target=3;
        System.out.print(search(nums, target));
    }
    static int search(int[] nums,int target){
        int peak=mountainIndex(nums);
        int firstTry=binarySearch(nums, target, 0, peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        else
        return binarySearch(nums, target, peak, nums.length-1);
    }
    static int binarySearch(int[] nums,int target,int start,int end){
        boolean isAsc= nums[start]<nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(isAsc){
                if(target>nums[mid])
                start=mid+1;
                else
                end=mid-1;
            }
            else 
            {
                if(target>nums[mid])
                end=mid-1;
                else
                start=mid+1;
            }
    }
    return -1;
    }
    static int mountainIndex(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //you're in dec part of array
                // this may be the ans
                //but there are other possibilities on the left  side.
                //this is why end!=mid-1
                end=mid;
            }
            else if(nums[mid]<nums[mid+1]){
                //you're in asc part of array
                start=mid+1;// since we know mid+1> mid
            }
            //when both start and max are equal that is the max element.
            // at every point of time, start and end have best possible ans
            //
        }
        return start;
        
    }
}
