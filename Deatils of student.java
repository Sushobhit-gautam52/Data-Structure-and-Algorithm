import java.util.Scanner;

class student{
    int rollno;
    String name;
    int marks;
    public student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}
class Myclass{//NON PRIMITIVE TYPE ARRAY
    public static void main(String[] args) {
        student arr[]=new student[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=new student(sc.nextInt(),sc.next(),sc.nextInt());
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].rollno + "\t" + arr[i].name + "\t" + arr[i].marks);
        }
    }
}
