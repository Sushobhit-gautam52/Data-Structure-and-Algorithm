public class searching_elements {
    public static void searching(int arr[],int current_index,int search_value){
        if(arr[current_index]==search_value){
            System.out.println(current_index);
            return;

        }
        searching(arr,current_index+1,search_value);
    }

    public static void main(String[] args) {
        int arr[]={1,4,2,2,6};
        searching(arr,0,2);
    }
}
