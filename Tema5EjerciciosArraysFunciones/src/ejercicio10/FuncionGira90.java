package ejercicio10;

import java.util.Arrays;

public class FuncionGira90 {

	static int[][] gira90(int tablaInicio[][]) {

		int tablaCopia[][] = new int [tablaInicio.length][tablaInicio.length];

		for (int fila = 0; fila < tablaInicio.length; fila++) {
			
			tablaCopia=Arrays.copyOf(tablaCopia,tablaCopia[0].length+1);
			
			for (int columna = 0; columna >tablaInicio.length ; columna++) {
				
				tablaCopia=Arrays.copyOf(tablaCopia,tablaCopia.length+1);
				//tablaInicio[fila][columna]
				//tablaCopia[fila][columna] = tablaInicio[columna][fila];
				
			}
		}

		return tablaCopia;
	}
}
