import java.util.Scanner;

// import java.util.Scanner;

public class UserInput {
    public static void main(String args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a=s.nextInt();
        System.out.println("Enter Number 2:");
        int b=s.nextInt();
        int result=a*b;
        System.out.println("Result"+result);
        s.close();
    }
    
}
