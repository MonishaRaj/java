import java.io.Console;

public class Main{

	public static void main(String[] args) {

		Console cons;

		if ((cons = System.console()) != null) {

			char[] pass = null;

			try {

				pass= cons.readPassword("Input your Password:");

				System.out.println("Your password was: " + new String(pass));

			} finally {

				if (pass != null) {

					java.util.Arrays.fill(pass, ' ');

				}

			}

		} else {

			throw new RuntimeException("Can't get password...No console");

		}

	}

}