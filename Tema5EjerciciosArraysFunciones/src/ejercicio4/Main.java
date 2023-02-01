package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 8, 4, 6, 12, 10 };

		int numeroUsuario;

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca valor clave a buscar en : ");

		numeroUsuario = dogma.nextInt();

		dogma.close();

		System.out.println(FuncionBuscar.buscar(tabla, numeroUsuario));

	}

}
