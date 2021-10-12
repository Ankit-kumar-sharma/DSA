import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter element that you want to search in array:");
        int num=s.nextInt();
        int[] arr={1,2,3,3,6};
       LinearSearch obj=new LinearSearch();
      System.out.println("Element found "+obj.leanSearch(num, arr));
        s.close();
    }
    public boolean leanSearch(int searchElement,int[] arr)
    {
        boolean found=false;
        for(int i=0; i<arr.length; i++)
        {
            if(searchElement==arr[i])
            {
                found=true;
                System.out.println("Found at Index: "+i);
            }
          
        }
       return found;
    }
    
}
