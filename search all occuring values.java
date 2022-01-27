public class searching_all_elements {
    public static void searching(int arr[],int current_index,int search_value){
        if(arr[current_index]==search_value) {
            System.out.println(current_index);


        }
        searching(arr,current_index+1,search_value);
        return;
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int arr[]={1,7,4,7,6};
        searching(arr,0,7);
    }
}
