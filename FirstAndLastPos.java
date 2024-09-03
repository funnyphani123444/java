
public class FirstAndLastPos {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int res[]=searchRange(nums, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
    
    public static int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);

        res[0]=start;
        res[1]=end;
        return res;
    }
    static int search(int[] nums,int target,boolean findStartIndex){
        int start=0;
        int ans=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println(mid);
            if(nums[mid]==target){      
                ans= mid;
                if(findStartIndex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;     
                }
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}
