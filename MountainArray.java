public class MountainArray {
    public static void main(String[] args){
        int[] nums={1,2,3,5,6,4,3,2};
        int index=mountainIndex(nums);
        System.out.print(index);
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
