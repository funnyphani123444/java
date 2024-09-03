import java.util.Arrays;

public class HeightCheckerLS {
    public static void main(String[] args) {
        int nums[]={1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
        
    }
    public static int heightChecker(int[] heights) {
        int[] nums= new int[heights.length];
        for(int i=0;i<heights.length;i++){
        int last= heights.length-i-1;
        int maxIndex=getMaxIndex(heights,0,last);
        copy(heights,nums,maxIndex,last);
        }
        System.out.println(Arrays.toString(nums));
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(nums[i]!=heights[i])
            count++;
        }
        return count;
    }
    public static void copy(int[] heights,int[] nums,int maxIndex,int last){
        nums[last]=heights[maxIndex];
    }
    public static int getMaxIndex(int[] heights,int start,int last){
        int maxIndex=start;
        for(int i=start;i<=last;i++){
            if(heights[maxIndex]<heights[i])
            maxIndex=i;
        }
        return maxIndex;
    }
}
