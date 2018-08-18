import java.util.Scanner;

class Main

{

  public static void main(String args[])

  {

    Scanner input = new Scanner( System.in );

    System.out.print("Enter a decimal number : ");

    int n =input.nextInt();

    String octalString = Integer.toOctalString(n);

    int r;

    String st=""; 

    char dig[]={'0','1','2','3','4','5','6','7'};

    while(n>0)

    {

       r=n%8; 

       st=dig[r]+st; 

       n=n/8;

    }

    System.out.println("Decimal to octal: "+st);

  }

}