package ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 10, 1, 5, 8, 9, 2 };

		int numeroUsuario;

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca un cantidad de elementos a sumar: ");

		numeroUsuario = dogma.nextInt();

		dogma.close();

		System.out.println(
				"El valor se encuentra en las posiciones: " + Arrays.toString(FuncionSuma.suma(tabla, numeroUsuario)));

	}

}
