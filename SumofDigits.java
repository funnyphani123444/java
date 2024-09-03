public class SumofDigits {
    public static void main(String[] args){
        int ans=pOD(55);
        System.out.println(ans);
        int ans1=sOD(ans);
        System.out.print(ans1);
    }
 
    private static int pOD(int i) {
        if(i%10==i)
        return i;
        return (i%10)*pOD(i/10);
    }
    private static int sOD(int i) {
        if(i==0)
        return 0;
        return (i%10)+sOD(i/10);
    }
    
}
