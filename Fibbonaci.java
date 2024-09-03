public class Fibbonaci {
    public static void main(String[] args) {
        int ans=fibbonaci(45);
        System.out.print(ans);
    }
    public static int fibbonaci(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        return fibbonaci(n-1)+fibbonaci(n-2);
    }
    
}
