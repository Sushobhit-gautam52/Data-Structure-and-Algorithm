import java.util.Scanner;

public class validity{
    public static boolean Seq(String str)
    {
        if(str.length()==0) return true;
        if(str.length()==1){
            return str.charAt(0) == 'a';
        }
        if(str.charAt(0)=='a'){
            return Seq(str.substring(1));
        }
        else if(str.charAt(0)=='b' && str.charAt(1)=='b'){
            return Seq(str.substring(2));
        }
        else return false;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.charAt(0)=='a') System.out.println(Seq(str));
        else System.out.println("false");
    }
}
