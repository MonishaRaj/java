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

        int dec, i=1, j;

        int oct[] = new int[100];

        Scanner in = new Scanner(System.in);

		System.out.print("Input a hexadecimal number: ");

        hexdec = in.nextLine();

        dec = hex_to_decimal(hexdec);

        while(dec != 0)

        {

            oct[i++] = dec%8;

            dec = dec/8;

        }

		System.out.print("Equivalent of octal number is: ");

        for(j=i-1; j>0; j--)

        {

            System.out.print(oct[j]);

        }

		System.out.print("\n");

    }

}