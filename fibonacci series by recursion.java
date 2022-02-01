import java.util.Scanner;

public class test {
    static int a=0, b=1,c;
    public static void main(String[] args) {
        System.out.print(a+" "+b);
        test obj=new test();
       obj.fib(10);
    }
    void fib(int n){
         if(n>=1){
             c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;
             fib(n-1);
         }
    }
}
