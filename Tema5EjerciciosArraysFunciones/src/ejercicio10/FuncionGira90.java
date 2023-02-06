package ejercicio10;

public class FuncionGira90 {

	static int[][] gira90(int tablaInicio[][]) {

		int tablaCopia[][] = tablaInicio;

		for (int fila = 0; fila < tablaInicio.length; fila++) {

			for (int columna = 0; columna < tablaInicio.length; columna++) {

				for (int columnaCopia = tablaCopia.length - 1; columnaCopia > 0; columnaCopia--) {

					tablaCopia[columnaCopia][fila] = tablaInicio[fila][columna];

				}
			}
		}

		return tablaCopia;
	}
}
