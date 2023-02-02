package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 8, 4, 6, 1, 5, 2, 4, 6, 8, 3 };

		int numeroUsuario;

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca un valor maximo: ");

		numeroUsuario = dogma.nextInt();

		dogma.close();

		System.out.println("Este es el array sin los valores mayores al introducido: "
				+ Arrays.toString(FuncionEliminarMayores.eliminarMayores(tabla, numeroUsuario)));

	}

}
