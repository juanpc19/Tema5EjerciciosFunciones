package ejercicio5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int tabla[] = { 8, 4, 6, 1, 5, 2, 4, 6, 8, 3 };

		System.out.println("Este es el array sin los valores repetidos: "
				+ Arrays.toString(FuncionSinRepetidos.sinRepetidos(tabla)));

	}

}
