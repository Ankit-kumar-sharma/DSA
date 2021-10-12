//Bubble Sort Optimized Code
import java.util.Arrays;
import java.util.Scanner;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[]={2,0,1,4,3,6,5};
        System.out.println("Unsorted Array: "+Arrays.toString(arr));
        int n=arr.length;
        BubbleSort obj=new BubbleSort();
        obj.bSort(arr, n);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        // System.out.println(n);
        s.close();

    }
    public void bSort(int arr[],int n)
    {
        boolean swapped=false;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                break;
            }
        }

    }

}