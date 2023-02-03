package ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		int numeroUsuario = 0;

		Scanner dogma = new Scanner(System.in);

		//bucle de comprobacion de ontroduccion de datos
		do {
			System.out.println("Cuantos elementos quiere sumar? ");

			numeroUsuario = dogma.nextInt();

			if (numeroUsuario <= 0 || numeroUsuario>tabla.length) {
				System.out.println("Por favor asegurese de introducir un numero igual o mayor a 1"
						+ " e igual o menor a la longitud del array ("+ tabla.length+ ")");
			}

		} while (numeroUsuario <= 0 || numeroUsuario>tabla.length);

		dogma.close();

		System.out.println("El valor de la suma de " + numeroUsuario + " dos elementos consecutivos del array es: : "
				+ Arrays.toString(FuncionSuma.suma(tabla, numeroUsuario)));

	}

}
