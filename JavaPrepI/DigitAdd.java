import java.util.Scanner;

public class DigitAdd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = s.nextInt();
        addNumberDigit(num);
        s.close();
    }

    public static void addNumberDigit(int num) {
        int sum = num;
        while (num != 0) {
            num = num / 10;
            sum = sum + num;

        }
        System.out.println(sum);
    }
}
