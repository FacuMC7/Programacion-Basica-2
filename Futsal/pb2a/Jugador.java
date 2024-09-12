package pb2a;

public class Jugador {

	int edad;
	double precio;
	String nombre;
	
	public Jugador(int edad, double precio, String nombre) {
		this.edad = edad;
		this.precio = precio;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[edad=" + edad + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	
	
}
