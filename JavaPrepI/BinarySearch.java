import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to be search");
        int num=s.nextInt();
        int arr[]={1,3,4,0,8,7};
        int low=0;
        int high=arr.length-1;
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        BinarySearch obj=new BinarySearch(); 
        System.out.println(obj.bSearch(num,arr,low,high));  
        s.close();
    }
    public boolean bSearch(int num, int arr[],int low, int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(num==arr[mid])
            {
                return true;
            }
            else if(num<arr[mid])
            {
               high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }     
       return false;
       
    }

}
