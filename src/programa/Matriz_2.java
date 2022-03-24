package programa;

import java.util.Scanner;

public class Matriz_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de  linhas e colunas: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.print("Informe o numero para consulta de posição: ");

		System.out.println();
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
