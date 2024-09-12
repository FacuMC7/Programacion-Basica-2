package pb2;

import java.util.Scanner;

import pb2a.Consultor;
import pb2a.Empleado;

public class Herencia {

	public static void main(String[] args) {

		int dni;
		int telefono;
		String apellido;
		String nombre;
		String direccion;
		String nombreConsultora;
	    int numConsultora;
	    double sueldo;
	    int numeroLegajo;
	    String cargo;
	    
	    //int dni, int telefono, String apellido, String nombre, String direccion, String nombreConsultora,
		//int numConsultora
	    
	    Empleado actual = null;
		Consultor consultora = null;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese dni del consultor: ");
		dni = teclado.nextInt();
		
		System.out.println("Ingrese telefono del consultor: ");
		telefono = teclado.nextInt();
		
		System.out.println("Ingrese apellido del consultor: ");
		apellido = teclado.next();
		
		System.out.println("Ingrese nombre del consultor: ");
		nombre = teclado.next();
		
		System.out.println("Ingrese direccion del consultor: ");
		direccion = teclado.next();
		
		System.out.println("Ingrese nombre de la consultora: ");
		nombreConsultora = teclado.next();
		
		System.out.println("Ingrese numero de la consultora: ");
		numConsultora = teclado.nextInt();
		
		consultora = new Consultor(dni, telefono, apellido,nombre,direccion,nombreConsultora,numConsultora);
		
		System.out.println(consultora);
			
		
		System.out.println("Ingrese dni del empleado: ");
		int dni2 = teclado.nextInt();
		
		System.out.println("Ingrese telefono del empleado: ");
		int telefono2 = teclado.nextInt();
		
		System.out.println("Ingrese apellido del empleado: ");
		String apellido2 = teclado.next();
		
		System.out.println("Ingrese nombre del empleado: ");
		String nombre2 = teclado.next();
		
		System.out.println("Ingrese direccion del empleado: ");
		String direccion2 = teclado.next();
		
		System.out.println("Ingrese sueldo del empleado: ");
		sueldo = teclado.nextDouble();
		
		System.out.println("Ingrese numero de legajo del empleado: ");
		numeroLegajo = teclado.nextInt();
		
		System.out.println("Ingrese cargo del empleado: ");
		cargo = teclado.next();
		
		actual = new Empleado(dni2, telefono2, apellido2,nombre2,direccion2,sueldo,numeroLegajo,cargo);
		
		System.out.println(actual);
		
	}

}
