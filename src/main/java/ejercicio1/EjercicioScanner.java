package ejercicio1;

import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hola Carolina Bienvenida");
		System.out.println("Puedes ingresar un valor");

		int a = scanner.nextInt();
		System.out.println("Puedes ingresar un valor");
		int b = scanner.nextInt();


	}

	public String validarSiAesMayorBB(int a, int b) {
	
		String resultadoValidar = null;
		
		if(a > b) {
			resultadoValidar = "La variable A es mayor a B";
		}
		
		if(a < b) {
			resultadoValidar = "La variable a es menor a b";
		}
		if(a==b) {
			resultadoValidar = "La variable a es igual a b";
		}
		return resultadoValidar;
	}

}
