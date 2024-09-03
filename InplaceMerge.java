import java.util.Arrays;
public class InplaceMerge {
    public static void main(String[] args) {
        int[] nums={8,3,4,12,5,6};
        mergesort(nums,0,nums.length);
        System.out.print(Arrays.toString(nums));
    }
    public static void mergesort(int[] nums,int start,int end){
        if(end-start==1)
        return;

        int mid=(start+end)/2;
        mergesort(nums, start, mid);
        mergesort(nums, mid, end);
        merge(nums,start,mid,end);
        
    }
    private static void merge(int[] nums, int s, int m, int e) {
       int[] mix=new int[e-s];
       int i=s;
       int j=m;
       int k=0;
       while(i<m&&j<e){
        if(nums[i]<nums[j]){
            mix[k]=nums[i];
            i++;
        }
        else{
            mix[k]=nums[j];
            j++;
        }
        k++;
       }
       while(i<m){
        mix[k]=nums[i];
        i++;
        k++;
       }
       while(j<e){
        mix[k]=nums[j];
        j++;
        k++;
       }
       for(int l=0;l<mix.length;l++){
        nums[s+l]=mix[l];
       }
    }
    }
