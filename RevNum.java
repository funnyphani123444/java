public class RevNum {
    public static void main(String[] args) {
        rev1(5431);
        //System.out.print(sum);
    }
    static int sum=0;
    public static void rev1(int n){
        if(n==0){
        return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
        System.out.println(sum);
    }
}
