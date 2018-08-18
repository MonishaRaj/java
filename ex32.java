import java.util.Scanner;

public class Main {

 public static void main( String args[] )    

    {

        Scanner input = new Scanner(System.in);

        int a;      

        int b;   

      

        System.out.print( "Input first integer: " );       

        a = input.nextInt();    

 

        System.out.print( "Input second integer: " );         

        b = input.nextInt();            

        

        if ( a ==b )           

            System.out.printf( "%d == %d\n", a,b );  

        if ( a != b)          

            System.out.printf( "%d != %d\n", a, b );  

        if ( a < b )          

            System.out.printf( "%d < %d\n", a, b );  

        if ( a > b )          

            System.out.printf( "%d > %d\n",a, b );  

        if ( a <= b)          

            System.out.printf( "%d <= %d\n", a,b );  

        if ( a >= b )          

            System.out.printf( "%d >= %d\n", a, b );  

    }