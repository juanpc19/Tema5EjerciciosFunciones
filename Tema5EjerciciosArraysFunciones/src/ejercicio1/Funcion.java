package ejercicio1;

public class Funcion {

	static int sumaPosiciones(int t[]) {
		int sumaElementos = 0;

		for (int posicion = 0; posicion < t.length; posicion++) {

			sumaElementos += t[posicion];
		}

		return sumaElementos;
	}
}
