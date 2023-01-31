package ejercicio2;

public class FuncionMaximo {

	static int maximo(int t[]) {
		int maximo = 0;

		for (int posicion = 0; posicion < t.length; posicion++) {

			if (t[posicion] > maximo) {
				maximo = t[posicion];
			}
		}

		return maximo;
	}

}
