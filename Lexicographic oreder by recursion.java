public class lexicographic_order {
    public static void method1(int initial_value,int end_value){
        if(initial_value>end_value){
            return;
        }
        System.out.println(initial_value);
        int i=0;
        if(initial_value==0){i=1;}
        while(i<10){
            method1(initial_value*10+i,end_value);
            i++;
        }
    }
    public static void main(String[] args) {
            method1(0,100);

    }
}
