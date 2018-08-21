import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {

        int num, rev = 0, remainder, org;
      System.out.println("Enter number to check!!");
       Scanner in = new Scanner(System.in);
      num = in.nextInt();

        org = num;

       
        while( num != 0 )
        {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num  /= 10;
        }

        
        if (org == rev)
            System.out.println(org + " is a palindrome.");
        else
            System.out.println(org + " is not a palindrome.");
    }
}