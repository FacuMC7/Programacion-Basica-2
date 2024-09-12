package pb2a;

import java.util.ArrayList;
import java.util.List;

public class Liga {

	 List<Equipo>listaEquipos;
	 int equipos = 25;
	 
	 
	 public Liga() {
		 this.listaEquipos = new ArrayList<>();
		 this.equipos = equipos;
		
	 }
	 
	 public boolean agregar(Equipo equipoNuevo) {
		 if(listaEquipos.size()<equipos) {
			 return listaEquipos.add(equipoNuevo);
		 } else {
			 System.out.println("Limite de equipos alcanzado");
			 return false;
		 }
	 }
	 
	 public Equipo buscarEquipo(int opcionSeleccionada) {
		Equipo buscado = null;
		buscado = listaEquipos.get(opcionSeleccionada);
		return buscado; 
			
		}
	 
	 public void listaDeEquipos() {
			System.out.println("\nLista de equipos: ");
			
			for(int i=0; i<listaEquipos.size(); i++) {
				if(listaEquipos.get(i) != null) {
					System.out.println("[" + i + "]= " + listaEquipos.get(i));
				}	
			}
		}
	
	
}
