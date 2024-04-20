package ar.edu.unju.fi.ejercicio3; 
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		//usamos scanner
		Scanner scanner = new Scanner(System.in);
		// solicitamos un numero entero
		System.out.println(" ingrese un numero entero");
		int numero = scanner.nextInt();
		//cerramos Scanner
		scanner.close();
		// verificamos si el numero es par o impar
		if (numero % 2 == 0) {
			System.out.println("el numero es par. ");
			System.out.println("el triple del numero es: " + (numero * 3));
		} else { 
			System.out.println("el numero es impar");
			System.out.println("el doble del numero es: " + (numero * 2));
			
		}		
	}
}
