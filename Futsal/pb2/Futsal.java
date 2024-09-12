package pb2;

import java.util.Scanner;

import pb2a.Equipo;
import pb2a.Jugador;
import pb2a.Liga;

public class Futsal {

	public static void main(String[] args) {

		String nombreEquipo;
		int socios;
		double gastos;
		int edad;
		double precio;
		String nombreJugador;
		int contadorEquipos = 0;
		int indice = 0;
		
		Liga actualLiga = new Liga();
		Equipo actualEquipo = null;
		Jugador actualJugador = null;
		
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada;
		do {
		System.out.println("\n---MENU DE OPCIONES---");
		System.out.println("1 - Agregar equipo");
		System.out.println("2 - Agregar jugador");
		System.out.println("3 - Obtener lista de equipos");
		System.out.println("4 - Salir");
		System.out.println("\nIngrese una opcion: ");
		opcionSeleccionada = teclado.nextInt();
		
		switch(opcionSeleccionada) {
		
		case 1:
			if(contadorEquipos < 25) {
			System.out.println("\nIngrese el nombre del equipo: ");
			nombreEquipo = teclado.next();
			
			System.out.println("Ingrese el numero de socios: ");
			socios = teclado.nextInt();
			
			System.out.println("Ingrese los gastos del equipo: ");
			gastos = teclado.nextDouble();
			
			actualEquipo = new Equipo(nombreEquipo, socios, gastos);
			
			actualLiga.agregar(actualEquipo);
			contadorEquipos++;
			} else {
				System.out.println("Ya se registraron los 25 equipos...");
			}
			
			break;
			
		case 2:
			
			System.out.println("\nLista de equipos: ");
			actualLiga.listaDeEquipos();
			
			if(indice >= 0 && indice < contadorEquipos) {

			System.out.println("\nIngrese el número del equipo para el jugador nuevo: ");
			indice = teclado.nextInt();
			
			System.out.println("Ingrese el nombre del jugador: ");
			nombreJugador = teclado.next();
			
			System.out.println("Ingrese la edad del jugador: ");
			edad = teclado.nextInt();
			
			System.out.println("Ingrese el precio del jugador: ");
			precio = teclado.nextDouble();
			
			actualJugador = new Jugador(edad, precio, nombreJugador);
			
			actualLiga.buscarEquipo(indice).agregar(actualJugador);
			
			} else {
				System.out.println("El equipo no existe...");
			}
			
			break;
			
		case 3:	
			actualLiga.listaDeEquipos();
			break;
			
		case 4:
			System.out.println("Saliendo...");
		}
		}while(opcionSeleccionada != 4 );
			
	}

}
