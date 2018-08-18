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

        int bin[] = new int[100];

        Scanner scan = new Scanner(System.in);

		 System.out.print("Enter Hexadecimal Number : ");

        hexdec = scan.nextLine();      

        dec = hex_to_decimal(hexdec);       

        while(dec != 0)

        {

            bin[i++] = dec%2;

            dec = dec/2;

        }

        System.out.print("Equivalent Binary Number is: ");

        for(j=i-1; j>0; j--)

        {

            System.out.print(bin[j]);

        }

        System.out.print("\n");

    }

}