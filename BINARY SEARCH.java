import java.util.*;
class BINARYSEARCH{
    public static void binarySearch(int arr[], int i, int j, int x){
        int mid = (i + j)/2;
        while( i <= j ){
            if ( arr[mid] < x ){
                i = mid + 1;
            }else if ( arr[mid] == x ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                j = mid - 1;
            }
            mid = (i +j)/2;
        }
        if (i > j ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int x = sc.nextInt();
       // int j=n;
        binarySearch(arr,0,n,x);
    }
}
