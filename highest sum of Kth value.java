import java.util.*;
class WindowSum {
    public static void main(String[] args) {
        int arr[]  ={2,3,5,4,8,6,1};
       
        int frame= new Scanner(System.in).nextInt();
        int maxsum =Integer.MIN_VALUE;

        for(int i =0;i<arr.length-frame;i++)
        {
            int framesum = 0;
            for(int j =i;j<i+frame;j++)
            {
                framesum= framesum+ arr[j];
            }
            maxsum= maxvalue(maxsum,framesum);
        }
        System.out.println(maxsum);
    }
    public static int maxvalue(int maxsum, int framesum)
    {
        if(maxsum>framesum)
            return maxsum;
        else
            return framesum;
    }
}
