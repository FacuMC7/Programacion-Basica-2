package pb2a;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	String nombre;
	int socios;
	double gastos;
	List<Jugador>listaJugadores;
	 int jugadores = 5;
	 
	public Equipo(String nombre, int socios, double gastos) {
		this.nombre = nombre;
		this.socios = socios;
		this.gastos = gastos;
		this.listaJugadores = new ArrayList<>();
	
	}
	
	 public boolean agregar(Jugador jugadorNuevo) {
		 if(listaJugadores.size()<jugadores) {
			 return listaJugadores.add(jugadorNuevo);
		 } else {
			 System.out.println("Limite de jugadores alcanzado");
			 return false;
		 }
	 }

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", socios=" + socios + ", gastos=" + gastos + ", JUGADORES: " +	listaJugadores.toString();
				
	}

	
	
}
