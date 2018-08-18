import java.util.Scanner;

public class Main {

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of a hexagon: ");

        double r = input.nextDouble();

        System.out.print("The area of the hexagon is: " + hexagonArea(r)+"\n");

    }

    public static double hexagonArea(double r) {

        return (6*(r*r))/(4*Math.tan(Math.PI/6));

    }

}