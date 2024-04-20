package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaracion de variables
		int a;
		// abrir Scanner
		Scanner scanner = new Scanner(System.in);
		// leyendo el numero
		System.out.println("ingrese un numero entre el 1 y el 9");
		a = scanner.nextInt();
		// desarrollo
		if (a>= 1 && a <=9 ) {
			System.out.println("tabla de multiplicar del: " + a );
			for (int i=0; i <= 10; i+=1) {
				System.out.println(a + " x " + i + "=" + a*i);
			}
		} else {
			System.out.println("el numero ingresado no esta en el rango deseado ");
		}
		//cerrar scanner
		scanner.close();

	}

}
