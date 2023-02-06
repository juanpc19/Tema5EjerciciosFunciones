package ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[][] = new int[4][4];

		Scanner dogma = new Scanner(System.in);

		for (int fila = 0; fila < tabla.length; fila++) {

			for (int columna = 0; columna < tabla.length; columna++) {

				System.out.println("Introduzca un numero.");

				tabla[fila][columna] = dogma.nextInt();
			}
		}

		dogma.close();

		System.out.println(FuncionEsMagica.esMagica(tabla) ? "Es magica. " : "No es magica. ");
	}

}
