import java.util.Scanner;

public class Main {

 public static void main(String[] args) 

   {

     Scanner in = new Scanner(System.in);

     long oct, dec = 0;

     int i = 0;

     System.out.print("Input any octal number: ");

    oct= in.nextLong();

    while (oct != 0) 

     {

      dec = (long)(dec + (oct % 10) * Math.pow(8, i++));

      oct = oct / 10;

     }

    System.out.print("Equivalent decimal number: " + dec+"\n");

   }

}