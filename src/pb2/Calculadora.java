package pb2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingrese su operacion\n 1 Para sumar\n 2 Para restar\n 3 Para multiplicar"
					+ "/n 4 Para dividir");
			opcion = teclado.nextInt();	
			
		}while(opcion < 1 && opcion > 4);
			
		System.out.println("\nIngrese el primer numero");
		a = teclado.nextInt();
		System.out.println("\nIngrese el segundo numero");
		b = teclado.nextInt();
		
		if(opcion.equals(1)) {
			resultado = a + b;	
		}else if(opcion.equals(2)) {
			resultado = a-b;
		}else if(opcion.equals(3)) {
			resultado = a * b;
		}else {
			resultado = a/b;
		}
		System.out.println("El resultado es " + resultado.toString());
	}
}
