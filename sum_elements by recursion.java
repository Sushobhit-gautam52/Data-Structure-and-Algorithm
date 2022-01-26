import java.util.Scanner;

public class sum_elements {
    public static void summing(int n,int arr[],int sum){
    if(n==0){
        System.out.println(sum);
        return;
    }
    summing(n-1,arr,sum+arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write the size of the given array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("elements of the given array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        summing(n,arr,0);
    }
}
