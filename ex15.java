public class Main

{

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a,b,c;

		System.out.println("Enter two values");

		a = in.nextInt();

		b = in.nextInt();

		c = a;

		a = b;

		b = c;

    	System.out.println("After Swapping");

    	System.out.println("Value of a is" + a);

    	System.out.println("Value of b is" + b);

		}

}