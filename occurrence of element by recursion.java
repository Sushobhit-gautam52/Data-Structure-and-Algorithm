class occurrences {
    public static int[] sol(int arr[], int ci,int search, int count)
    {
        if (ci==arr.length) {
            int [] occarr= new int[count];
            return occarr;
        }if(arr[ci]== search)
        {
            int ra[]= sol(arr, ci+1, search, count+1);
            ra[count]= ci;
            return ra;
        } else
        {
            int ra[]= sol(arr,ci+1,search, count);
            return ra;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,7,9,8,7,3};
        int[] ans = sol(arr, 0, 7, 0);
        if(ans.length== 0 ) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);

        }
    }
}
