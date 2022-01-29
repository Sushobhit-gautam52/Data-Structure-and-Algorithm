import java.util.Scanner;

public class string_into_numbers {
    public static int method(String str) {
        char ch[] = str.toCharArray();
        int sum = 0;
        int zeroAscii = (int) '0';
        for (char c : ch) {
            int tmpAscii = (int) c;
            sum = (sum * 10) + (tmpAscii - zeroAscii);
        }
        return sum;
    }
        public static void main(String[] args) {
            System.out.println("enter a numberic string");
        Scanner sc=new Scanner(System.in);
         String str=sc.next();
            System.out.println(method(str));
    }
}
