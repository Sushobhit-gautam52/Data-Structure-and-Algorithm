import java.util.Scanner;

class numbering {
    public static void number(int n, int i){
        if(i<=n) {
            System.out.print(i + " ");
            number(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        number(n,1);
    }
}
