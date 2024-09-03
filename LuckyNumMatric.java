import java.util.ArrayList;
import java.util.List;

public class LuckyNumMatric {
    public static void main(String[] args) {
        int[][] nums={{7,8},{1,2}};
        System.out.print(luckyNumbers(nums));

    }
    public static List<Integer> luckyNumbers (int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        int k=0;
        List<Integer> res= new ArrayList<>();
        while(k<n){
            int mrIndex=0;
            int mcIndex=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                //int max=Integer.MIN_VALUE;
                if(max<nums[i][k]){
                max=nums[i][k];
                mrIndex=i;
                mcIndex=k;
                }
            }
                if(min(mrIndex,mcIndex,nums,n))
                res.add(nums[mrIndex][mcIndex]);
                k++;
            }
            return res;
        }
    private static boolean min(int mrIndex, int mcIndex, int[][] nums, int n) {
        int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        if(min>nums[mrIndex][i])
        min=nums[mrIndex][i];
       }
       if(nums[mrIndex][mcIndex]==min)
       return true;
       return false;
    }
}
