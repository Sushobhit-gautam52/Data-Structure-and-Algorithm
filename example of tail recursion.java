class test{
    public static void method(int n){
        if (n<0) {
            return;
        }
        System.out.println(n);
        method(n-2);
    }

    public static void main(String[] args) {
        int num=5;
        method(num);
    }
}
