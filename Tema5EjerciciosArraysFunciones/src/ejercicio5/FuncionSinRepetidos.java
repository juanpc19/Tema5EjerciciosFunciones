package ejercicio5;

import java.util.Arrays;

public class FuncionSinRepetidos {

	static int[] sinRepetidos(int t[]) {

		// inicio array con longitud 0 para asignar la longitud necesaria posteriormente
		int tabla[] = new int[0];

		int respuesta = 0;// variable que guardara posicion devuelta por binary search

		// bucle para recorrer array t
		for (int posicion = 0; posicion < t.length; posicion++) {

			// ordeno la tabla
			Arrays.sort(tabla);

			// guardo en respuesta la posicion en la que el valor ha sido encontrado
			respuesta = Arrays.binarySearch(tabla, t[posicion]);

			// si respuesta devuelve negativo el valor de t[posicion] no esta en array tabla
			if (respuesta < 0) {
				// por lo que creo una posicion para el
				tabla = Arrays.copyOf(tabla, tabla.length + 1);
				// y lo inserto al final de array
				tabla[tabla.length - 1] = t[posicion];
			}

		}
		return tabla;
	}
}
