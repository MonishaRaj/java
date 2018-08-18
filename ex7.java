public class Main

{

	public static void main(String[] args) {

		int a,i;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");

		a = in.nextInt();

		for(i=0;i<=10;i++)

    	System.out.println(a + "X" + i + "=" + a*i);

		}

}