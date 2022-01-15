import java.util.Scanner;

public class naww {
    private int rollno;
    private String name;
    private int marks;
    Scanner s=new Scanner(System.in);
    naww(){
        System.out.println("enter the details of the student");
        setRollno();
        setName();
        setMarks();
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno() {
        int rollno=s.nextInt();
        rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        String name=s.next();
        name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks() {
        int marks=s.nextInt();
        marks = marks;
    }
}
class test123{
    public static void main(String[] args) {
        int sum=0;
        naww arr[]=new naww[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the details of student numbers" + (i+1));
            arr[i]=new naww();
        }
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMarks()>max){
                max=arr[i].getMarks();
                index=1;
            }
        }
        System.out.println("the details of the topper is ");
        System.out.println(arr[index].getRollno());
        System.out.println(arr[index].getName());
        System.out.println(arr[index].getMarks());
    }


}
