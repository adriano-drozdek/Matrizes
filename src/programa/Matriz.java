package programa;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de linha/coluna: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();

		int quant = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					quant++;
				}
			}
		}

		System.out.println();
		System.out.println("Numeros negativos: " + quant);

		sc.close();
	}

}
