package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		//usamos scanner
		Scanner scanner = new Scanner(System.in);
		// leemos el numero
		System.out.println("ingrese un numero entre el 1 y el 10: ");
		num = scanner.nextInt();
		// desarrollo
		if (num < 0 || num > 10 ) {
			System.out.println("el numero debe estar dentro del rango [0, 10]");		
		} else {
			int factorial = 1;
			int i = 1;
			while (i <= num) {
				factorial = i*factorial;
				i =  i+1;
			}
			
			System.out.println("el factorial de " + num + " es: " + factorial);
		}
		// cerrar scanner
		scanner.close();
	}

}
