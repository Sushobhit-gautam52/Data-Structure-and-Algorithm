public class conversion {
    public static int convertor(int n){
      if(n==0){
          return 0;
      }
      else{
         return (n%2+10* convertor(n/2));

      }
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(convertor(n));
    }
}
