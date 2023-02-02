package ejercicio7;

import java.util.Arrays;

public class FuncionBuscarTodos {

	static int[] buscarTodos(int t[], int valor) {

		// inicio array con longitud 0 para asignar la longitud necesaria posteriormente
		int tabla[] = new int[0];

		// bucle para recorrer array t
		for (int posicion = 0; posicion < t.length; posicion++) {

			// si el valor de array t en posicion posicion igual a valor
			if (t[posicion] == valor) {
				// creo una posicion para el valor en el array tabla
				tabla = Arrays.copyOf(tabla, tabla.length + 1);
				// y lo inserto al final de array
				tabla[tabla.length - 1] = posicion;
			}
		}

		return tabla;

	}

}
