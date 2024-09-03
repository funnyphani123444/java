public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        int[] nums={2,1,5,0,4,6};
        System.out.println(increasingTriplet(nums));
        String str="abc";
        char c=str.charAt(0);
        System.out.print(str+c);

    }
    public static boolean increasingTriplet(int[] nums) {
        for(int i=0;i<=nums.length-3;i++){
           int j=i+1;
           int k=i+2;
           if(nums[i]<nums[j]&&nums[j]<nums[k])
           return true;
       }
       return false;
   }
}
