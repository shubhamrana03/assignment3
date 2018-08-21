import java.util.Scanner;
public class reverse {

    public static void main(String[] args) {

        int num, rev = 0;
    System.out.println("For ulta ");
    Scanner in = new Scanner(System.in);
     num = in.nextInt();

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Answer is: " + rev);
    }
}