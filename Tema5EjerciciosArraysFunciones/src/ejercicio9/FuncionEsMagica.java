package ejercicio9;

import java.util.Arrays;

public class FuncionEsMagica {

	static boolean esMagica(int tabla[][]) {

		boolean magica = true;// variable que guardara si array es magico o no lo inicializo a true dando por
								// hecho que matriz es magica posteriormente comprobare si lo es o no

		int sumaFila = 0;// guardara suma de filas, inicializo a 0 para usar en bucle

		int sumaColumna = 0;// guardara suma de columnas, inicializo a 0 para usar en bucle

		for (int fila = 0; fila < tabla.length; fila++) {

			for (int columna = 0; columna < tabla.length; columna++) {

				// añado valor de [fila][columna] a sumaFila
				sumaFila += tabla[fila][columna];
				// añado valor de [columna][fila] a sumaColumna
				sumaColumna += tabla[columna][fila];

			}
			// si la suma de las filas es diferente a la suma de las columnas
			if (sumaFila != sumaColumna) {
				// la matriz no es magica
				magica = false;
				// y hago break para cerra bucle
				break;
			}
		}

		// este for es para mayor claridad, no es requerido por la funcion
		for (int fila = 0; fila < tabla.length; fila++) {

			System.out.println(Arrays.toString(tabla[fila]));
		}

		return magica;

	}
}
