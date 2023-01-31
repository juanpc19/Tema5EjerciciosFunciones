package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int longitudUsuario;
		
		int numeroUsuario;
		
		Scanner dogma = new Scanner(System.in);
		
		System.out.println("Introduzca longitud de la tabla: ");
		
		longitudUsuario=dogma.nextInt();
		
		System.out.println("Introduzca numero par maximo: ");
		
		numeroUsuario=dogma.nextInt();
		
		dogma.close();
		
		System.out.println(FuncionRellenaPares.rellenaPares(longitudUsuario, numeroUsuario));

	}

}
