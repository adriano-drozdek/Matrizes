package programa;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		sc.close();
	}

}
