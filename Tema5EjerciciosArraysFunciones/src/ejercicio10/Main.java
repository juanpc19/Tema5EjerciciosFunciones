package ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[][] = new int[4][4];

		Scanner dogma = new Scanner(System.in);

		for (int fila = 0; fila < tabla.length; fila++) {

			for (int columna = 0; columna < tabla.length; columna++) {

				tabla[fila][columna] = dogma.nextInt();
			}
		}

		dogma.close();

		System.out.println(Arrays.toString(FuncionGira90.gira90(tabla)));

	}

}
