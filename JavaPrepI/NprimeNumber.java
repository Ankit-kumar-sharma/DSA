import java.util.Scanner;

public class NprimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the prime number position to be found :");
        int num = s.nextInt();
        NprimeNumber obj = new NprimeNumber();
        obj.nPrimeFinder(num);
        s.close();

    }

    public int nPrimeFinder(int num) {
        int find = -1;
        int count=0;
        System.out.println(count);
        // for (int i = 2; i < 50; i++) {
        //     if(i%2==0)
        // }

        return find;
    }
}