import java.util.Scanner;

public class counting {
    public static void number_count(int n,int count){
        if(n==0){
            System.out.println(count);
            return;
        }
        number_count(n/10,count+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of any length");
        int n=sc.nextInt();
        number_count(n,0);
    }
}
