import java.util.Scanner;

class employee{
    int emp_id;
    String name;
    String address;
    int salary;
    String designation;

    public employee(int emp_id, String name, String address, int salary, String designation) {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
    }
}
class Myclass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        employee arr[]=new employee[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next());
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].emp_id + "\t" + arr[i].name + "\t" + arr[i].address+"\t"+
                    arr[i].salary+"\t"+arr[i].designation);

        }

    }
}
