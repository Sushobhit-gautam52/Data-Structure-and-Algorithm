import java.util.Scanner;
public class deletion {
    public static void main(String[] args) {
        System.out.println("enter the no. of elements int the index");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of the element which you want to delete from the array");
        int deleted_value=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(deleted_value==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);

        }
    }
}
