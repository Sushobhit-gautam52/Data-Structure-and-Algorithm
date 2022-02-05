import java.util.Scanner;
class Test123
{
    static int arr[] = {12, 34, 54, 2, 3};
    static int recSearch(int arr[], int l, int r, int x)
    {
        if (r < l)
            return -1;
        if (arr[l] == x)
            return l;
        if (arr[r] == x)
            return r;
        return recSearch(arr, l+1, r-1, x);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int index = recSearch(arr, 0, arr.length-1, x);
        if (index != -1)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}
