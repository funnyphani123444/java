
import java.util.*;
public class Anagram {
 
    public static String check(char[]ch, char[]ch1){
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=ch1[i])
            return "False";
        }
        return "True";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        if(str.length()==str1.length()){
        char[] ch= new char[str.length()];
        char[] ch1= new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            ch1[i]=str1.charAt(i);
        }
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(char c: ch){
            System.out.print(c+" ");
        }
        for(char c: ch1){
            System.out.print(c+" ");
        }
        String res=check(ch,ch1);
        System.out.println(res);
    }
    else
        System.out.println("False");
        sc.close();
    }
}
