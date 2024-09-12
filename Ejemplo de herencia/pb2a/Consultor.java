package pb2a;

public class Consultor extends Persona {

	String nombreConsultora;
	int numConsultora;
	
	public Consultor() {
	}
	
	public Consultor(int dni, int telefono, String apellido, String nombre, String direccion, String nombreConsultora,
			int numConsultora) {
		super(dni, telefono, apellido, nombre, direccion);
		this.nombreConsultora = nombreConsultora;
		this.numConsultora = numConsultora;
	}

	public String getNombreConsultora() {
		return nombreConsultora;
	}

	public void setNombreConsultora(String nombreConsultora) {
		this.nombreConsultora = nombreConsultora;
	}

	public int getNumConsultora() {
		return numConsultora;
	}

	public void setNumConsultora(int numConsultora) {
		this.numConsultora = numConsultora;
	}

	@Override
	public String toString() {
		return "Consultor [nombreConsultora=" + nombreConsultora + ", numConsultora=" + numConsultora + ", dni=" + dni
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	
	
}
