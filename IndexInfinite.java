
public class IndexInfinite {
    public static void main(String[] args){
        int[] nums={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        int index=ans(nums, target);
        System.out.print(index);
    }
    static int ans(int[] nums,int target){
        //finding range
        //first start with a box of 2
        int start=0;
        int end=1;
        while(target>nums[end])
        {
            int temp=end+1;
            //newend=prev end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums,int target,int start,int end){
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
}
