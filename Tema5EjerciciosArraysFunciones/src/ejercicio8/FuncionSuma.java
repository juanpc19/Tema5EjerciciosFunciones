package ejercicio8;

import java.util.Arrays;

public class FuncionSuma {

	static int[] suma(int t[], int numElementos) {

		// inicio array con longitud 0 para asignar la longitud necesaria posteriormente
		int tabla[] = new int[0];

		int sumaElementos = 0;// guardara valor de los elementos sumados

		int posicionSecundaria = 0;// guardara valor de posicion

		int contador = 0; // guardara cantidad de elementos sumados

		// bucle que dara a posicion el valor de la posicion del array desde la que se
		// debera a empezar a sumar elementos
		for (int posicion = 0; posicion <= t.length - numElementos; posicion++) {

			// doy a posicionSecundaria valor de posicion para alterar dicho valor sin
			// afectar al bucle principal
			posicionSecundaria = posicion;

			// bucle que se ejecutara mientras contador sea menor que numeroElementos y
			// posicion Secundaria sea menor a la longitud de array t
			// lo usare para recoger valor de los 3 elementos cuyo valor he de añadir a
			// sumaElementos
			while (contador < numElementos && posicionSecundaria < t.length) {
				//sumo valor de elemento en posicionSecundaria a sumaElementos
				sumaElementos += t[posicionSecundaria];
				//aumento valor de posicionSecundaria en +1
				posicionSecundaria++;
				//aumento valor de contador en +1
				contador++;
			}
			//creo posicion en array tabla 
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			//introduzco en la nueva posicion creada el valor de sumaElementos
			tabla[tabla.length - 1] = sumaElementos;
			//reinicio valor de sumaElemenos a 0
			sumaElementos = 0;
			//reinicio valor de contador a 0
			contador = 0;
		}

		//hago return
		return tabla;
	}
}
