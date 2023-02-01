package ejercicio4;

public class FuncionBuscar {

	static int buscar(int t[], int clave) {

		int resultado = 0;

		for (int posicion = 0; posicion < t.length; posicion++) {

			if (t[posicion] == clave) {
				resultado = posicion;
				break;

			} else {
				resultado = -1;
			}
		}

		return resultado;
	}

}
