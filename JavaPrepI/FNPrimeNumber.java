import java.util.Scanner;
public class FNPrimeNumber {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n;
        int status=1;
        int num=3;
        System.out.println("Enter the value of n :");
        n=s.nextInt();
        if(n>=1)
        {
            System.out.println("First "+n+" prime number are: ");
            System.out.println(2);
        }
        for(int i=2; i<=n;)
        {
            System.out.println("Sqrt: "+Math.sqrt(num));
            for(int j=2; j<=Math.sqrt(num); j++)
            {
                if(num%j==0)
                {
                    status=0;
                    break;
                }

            }
            if(status!=0)
            {
                System.out.println(num);
                i++;
            }
            status=1;
            num++;
        }
        s.close();

    }
}
