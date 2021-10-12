import java.util.Scanner;
public class UniqueNumber {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        String num=s.next();
        // System.out.println(num);
        UniqueNumber obj=new UniqueNumber();
        obj.checkDuplicate(num);
        s.close();
    }
    public void checkDuplicate(String num)
    {

    }

    
}
