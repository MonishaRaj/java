import java.util.Scanner;

class Main

{

   public static void main(String args[])

   {

     Scanner input = new Scanner( System.in );

     System.out.print("Enter a decimal number : ");

     int n =input.nextInt();

     int r;

     String st=""; 

    char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    while(n>0)

     {

       r=n%16; 

       st=hexa[r]+st; 

       n=n/16;

     }

     System.out.println("Decimal to hexadecimal: "+st);
     }
     }