package ejercicio3;

import java.util.Arrays;

public class FuncionRellenaPares {

	static int[] rellenaPares(int longitud, int fin) {

		int tabla[] = new int[longitud];

		int numeroAleatorio = 0;

		int posicion = 0;

		while (posicion < tabla.length) {

			numeroAleatorio = (int) (Math.random() * (fin + 1 - 2) + 2);
			if (numeroAleatorio % 2 != 0) {
				numeroAleatorio = (int) (Math.random() * (fin + 1 - 2) + 2);
				
			} else {
				tabla[posicion] = numeroAleatorio;
				posicion++;
			}
		}
		
		Arrays.sort(tabla);

		return tabla;
	}

}
