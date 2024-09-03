public class Maths {
   public static void main(String[] args) {
        //int n=7;
        //int[] nums= {1,2,1,4,5,4,2};
        //System.out.print(unique(nums));
        //System.out.print(iSeven(n));
        System.out.print(setBits(234567));
   } 
   public static boolean iSeven(int n){
    return (n&1)==0;
}
public static int unique(int[] nums){
    int k=0;
    for(int i=0;i<nums.length;i++){
        k=k^nums[i];
    }
    return k;
}
public static int magicNumber(int n){
    int ans=0;
    int base=5;
    while(n>0){
        int last=n&1;
        n=n>>1;
        ans+=base*last;
        base=base*5;
    }
    return ans;
 }
public static int pascalNSum(int n){
    int ans=1<<(n-1);//Math.pow(2,n-1);
    return ans;
}
public static int setBits(int n){
    int c=0;
    while(n>0){
        if((n&1)==1)
        c++;
        n=n>>1;
    }

    return c;
}
}
