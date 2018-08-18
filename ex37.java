import java.util.*;

 class Main

{

   public static void main(String args[])

   {

      String ori, rev = "";

      Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");

      ori = in.nextLine();

 int length = ori.length();

 for ( int i = length - 1 ; i >= 0 ; i-- )

         rev = rev + ori.charAt(i);

 System.out.println("Reverse of entered string is: "+rev);

   }

}