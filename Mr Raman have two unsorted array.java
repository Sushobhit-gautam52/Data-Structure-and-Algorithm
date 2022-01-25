import java.util.*;
class valued_arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of myarr1");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the myarr1");
        int[] myarr1 = new int[n];
        for (int i = 0; i < n; i++) {
            myarr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of myarr2");
        int m = sc.nextInt();
        System.out.println("Enter the elements of the myarr2");
        int[] myarr2 = new int[m];
        for (int i = 0; i < m; i++) {
            myarr2[i] = sc.nextInt();
        }
        int c;
        for (int i : myarr1) {
            c=0;
            for(int j : myarr2){
                if(i<=j){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
