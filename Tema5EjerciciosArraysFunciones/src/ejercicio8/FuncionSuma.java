package ejercicio8;

import java.util.Arrays;

public class FuncionSuma {

	static int[] suma(int t[], int numElementos) {
		
		int tabla[] = new int[0];
		
		int sumaElementos = 0;

		for (int posicion = 0; posicion < t.length - numElementos; posicion++) {

			//aumentar parte derecha a recorrer en +1
			for (int iteracion = posicion; iteracion < t.length - numElementos; iteracion++) {
				sumaElementos += t[iteracion];
			}
			tabla = Arrays.copyOf(tabla, tabla.length + 1);

			tabla[posicion] = sumaElementos;
			sumaElementos = 0;
		}

		return tabla;
	}
}
