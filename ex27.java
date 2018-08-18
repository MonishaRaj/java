import java.util.Scanner;

public class Main{

public static void main(String args[])

    {

        String oct, hex;

        int dec;

        Scanner in = new Scanner(System.in);

        System.out.print("Input a octal number : ");

        oct = in.nextLine();

        dec = Integer.parseInt(oct, 8);

        hex = Integer.toHexString(dec);

        System.out.print("Equivalent hexadecimal number: "+ hex+"\n");

     }

}