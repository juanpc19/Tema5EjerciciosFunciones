package ejercicio10;

import java.util.Arrays;

public class FuncionGira90 {

	static int[][] gira90(int tablaInicio[][]) {

		// creo array tablaCopia donde copiare el contenido del array tabla recibido del
		// main dandole la longitud del mismo
		int tablaCopia[][] = new int[tablaInicio.length][tablaInicio.length];

		// bucle estandar para recorrer array bidimensional eje y
		for (int fila = 0; fila < tablaInicio.length; fila++) {
			// bucle estandar para recorrer array bidimensional eje x
			for (int columna = 0; columna < tablaInicio.length; columna++) {

				// doy a tabla copia en posicion indicada el valor de tabla inicio indicado
				tablaCopia[columna][tablaCopia.length - 1 - fila] = tablaInicio[fila][columna];

			}
		}

		return tablaCopia;
	}
}
