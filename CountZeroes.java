public class CountZeroes {
    public static void main(String[] args) {
        System.out.print(countZeroes(3000100));
    }
    public static int zeroCount(int n)
    {
        int count =0;
        if(n%10==n){
            if(n%10==0)
            return count+1;
            else
            return count+0;
        }
        int rem=n%10;
        if(rem==0)
            count=count+1;
        return count+zeroCount(n/10);
    }
    public static int countZeroes(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c) {
       if(n==0)
       return c;
       int rem=n%10;
       if(rem==0)
       return helper(n/10,c+1);
       return helper(n/10,c);
    }
}
