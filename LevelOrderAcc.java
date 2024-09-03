
import java.util.*;

public class LevelOrderAcc {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        ArrayList<Integer> numsList = new ArrayList<>();
        
        for (String s : str1) {
            int num = Integer.parseInt(s);
            if (num == -2) {
                break;
            } else if (num != -1) {
                numsList.add(num);
            }
        }
        Integer[] nums = new Integer[numsList.size()];
        nums=numsList.toArray(nums);
        
        for (int i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
