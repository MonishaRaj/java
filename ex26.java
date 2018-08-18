import java.util.Scanner;

public class Main {

public static void main(String[] args) 

 {

  Scanner in = new Scanner(System.in);

  int[] oct = {0, 1, 10, 11, 100, 101, 110, 111};

  long octal_num, temp, binary, p;

  int r;

  System.out.print("Input any octal number: ");

  octal_num = in.nextLong();

  temp = octal_num;

  binary = 0;

  p = 1;

  while (temp != 0)

  {

   r = (int)(temp % 10);

   binary = oct[r] * p + binary;

   temp /= 10;

   p *= 1000;

  }

  System.out.print("Equivalent binary number: " + binary+"\n");

 }

}