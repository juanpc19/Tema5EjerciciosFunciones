package ejercicio7;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 8, 4, 6, 1, 5, 2, 4, 6, 8, 3 };

		int numeroUsuario;

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca un valor a buscar: ");

		numeroUsuario = dogma.nextInt();

		dogma.close();

		System.out.println("El valor se encuentra en las posiciones: "
				+ Arrays.toString(FuncionBuscarTodos.buscarTodos(tabla, numeroUsuario)));

	}

}
