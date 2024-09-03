import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums={1,1,4,2,1,3};
        selection(nums);
        System.out.print(Arrays.toString(nums));
    }   
    static void selection(int[] nums){
        for(int i=0;i<nums.length;i++){
            int last=nums.length-i-1;
            int maxIndex=getMaxIndex(nums,0,last);
            swap(nums,maxIndex,last);
        }
    }
    static void swap(int[] nums, int first,int second){
        int temp=nums[first];
        nums[first] =nums[second];
        nums[second]=temp;
    }
        static int getMaxIndex(int[] nums, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void insertionS(int[] nums){
        for(int i=0;i<=nums.length-2;i++){
            for (int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    swap(nums, j-1, j);
                }
                else
                break;
            }
        }
    }
    static void bubbleS(int[] nums){
        boolean swapped= false;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
