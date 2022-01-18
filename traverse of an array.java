class Efarraydemo{
    int arr[];
    public Efarraydemo(){
        arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void traverse(){
        for(int res:arr){
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        Efarraydemo obj=new Efarraydemo();
        try{
            obj.traverse();
        }
        catch(ArrayIndexOutOfBoundsException obj1){
            System.out.println("invalid index number");
       }
  }
}
