import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Subsetsum
{
    public static boolean isSubsetsum(int[] nums, int n,int target){
      
        if(target==0)
        return true;
        if(n==0)
        return false;
        if(nums[n-1]>target)
        return isSubsetsum(nums,n-1,target);
        
        else
        return isSubsetsum(nums,n-1,target-(nums[n-1]))||isSubsetsum(nums,n-1,target);
    }
	public static void main (String[] args) throws java.lang.Exception
	{  
		Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();
        int target=sc.nextInt();
        boolean res=isSubsetsum(nums,n,target);
        if(res)
        System.out.println("1");
        else
        System.out.println("0");
        sc.close();
    }


}

