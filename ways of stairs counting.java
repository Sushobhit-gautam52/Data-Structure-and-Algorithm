public class stairs_count {
    public static int method(int n){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        else{
            return method(n-3)+method(n-2)+method(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the numbers of steps you taken on the stairs");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(method( n));
    }
}
