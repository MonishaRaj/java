public class Main

{

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a,b,c,d;

		System.out.println("Enter three numbers");

		a = in.nextInt();

		b = in.nextInt();

		c = in.nextInt();

		d = (a+b+c)/3;

    	System.out.println("Average" +d);

    	}