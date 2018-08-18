import java.util.Scanner;

public class Main{

 public static void main(String[] args) 

 {

  int[] hex = new int[1000];

  int i = 1, j = 0, r, deci = 0, num;

  Scanner in = new Scanner(System.in);

  System.out.print("Input a Binary Number: ");

  num = in.nextInt();

  while (num > 0) {

   r = num % 2;

   deci = deci + r * i;

   i = i * 2;

   num = num / 10;

  }

   i = 0;

  while (deci != 0) {

   hex[i] = deci % 16;

   deci = deci / 16;

   i++;

  }

  System.out.print("HexaDecimal value: ");

  for (j = i - 1; j >= 0; j--)

  {

   if (hex[j] > 9) 

   {

    System.out.print((char)(hex[j] + 55)+"\n");

   } else

   {

    System.out.print(hex[j]+"\n");

   }

  }

 }

}