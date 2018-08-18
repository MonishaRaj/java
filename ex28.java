import java.util.Scanner;

public class Main {

public static int hex_to_decimal(String s)

    {

             String digits = "0123456789ABCDEF";

             s = s.toUpperCase();

             int value = 0;

             for (int i = 0; i < s.length(); i++)

             {

                 char c = s.charAt(i);

                 int d = digits.indexOf(c);

                 value = 16*value + d;

             }

             return value;

        

    }

    public static void main(String args[])

    {

        String hexdec;

        int dec;

        Scanner scan = new Scanner(System.in);

		System.out.print("Input a hexadecimal number: ");

        hexdec = scan.nextLine();

		dec = hex_to_decimal(hexdec);

		System.out.print("Equivalent decimal number is: " + dec+"\n");

    }

}