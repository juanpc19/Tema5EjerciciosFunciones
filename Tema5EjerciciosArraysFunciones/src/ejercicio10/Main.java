package ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[][] = new int[4][4];

		Scanner dogma = new Scanner(System.in);

		for (int fila = 0; fila < tabla.length; fila++) {

			for (int columna = 0; columna < tabla.length; columna++) {

				System.out.println("Introduzca un valor para la siguiente posicion del array: ");
				tabla[fila][columna] = dogma.nextInt();
			}
		}

		dogma.close();

		for (int fila = 0; fila < tabla.length; fila++) {
			System.out.println(Arrays.toString(tabla[fila]));
		}

		System.out.println();

		//print en linea del array tabla dado a funcion gira90 
		System.out.println(Arrays.deepToString(FuncionGira90.gira90(tabla)));

	}

}
