public class MissingNumLC {
    
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        missingNumber(nums);
    }
     static void missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci])
            swap(nums,i,ci);
            else 
            i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            System.out.print(j+1);
        }
    }
     static void swap(int[] nums, int first , int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
