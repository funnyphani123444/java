import java.util.*;
public class LinearSesrchRec {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,7,8,5,6,8};
        //List<Integer>res= new ArrayList<Integer>();
        System.out.println(findAllIndex2(nums, 8, 0));
        //System.out.println(res);
    }
    static int findIndex(int[] nums,int target,int index){
        if(index==nums.length)
        return -1;
        if(nums[index]==target)
        return index;
        else
        return findIndex(nums, target, index+1);
    }
    static List<Integer> findAllIndex(int[] nums,int target,int index,List<Integer> res){
        if(index==nums.length)
        return res;
        if(nums[index]==target)
        res.add(index);
        return findAllIndex(nums, target, index+1, res);
    }
    static List<Integer> findAllIndex2(int[] nums,int target,int index){
        List<Integer> res=new ArrayList<>();
        if(index==nums.length){
        return res;
        }
        if(nums[index]==target){
        res.add(index);
        }
        List<Integer> resFromBelow= findAllIndex2(nums, target, index+1);
        res.addAll(resFromBelow);
        return res;
    }
}
