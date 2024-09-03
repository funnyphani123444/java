import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] temp= new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        int j=n-k;
        for(int i=0;j<n;i++){
            nums[i]=temp[j];
            j++;
        }
        j=k;
        for(int i=0;j<n;i++)
        {
            nums[j]=temp[i];
            j++;
        }
        for(int i: nums)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}