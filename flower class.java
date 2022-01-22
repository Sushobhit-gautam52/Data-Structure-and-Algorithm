import java.util.Scanner;

class flower{
     String flower_name;
     int quantity;
     float price;

    public flower(String flower_name, int quantity, float price) {
        this.flower_name = flower_name;
        this.quantity = quantity;
        this.price = price;
    }
}
class myclass{
    public static void main(String[] args) {
        flower arr[]=new flower[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new flower(sc.next(),sc.nextInt(),sc.nextFloat());
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println("flower_name "+arr[i].flower_name + "\t" +"quantity "+arr[i].quantity + "\t" +"price "+ arr[i].price);

        }
    }
}
