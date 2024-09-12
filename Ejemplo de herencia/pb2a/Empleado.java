package pb2a;

public class Empleado extends Persona {

	double sueldo;
	int numeroLegajo;
	String cargo;
	
	public Empleado() {
	}

	public Empleado(int dni, int telefono, String apellido, String nombre, String direccion, double sueldo,
			int numeroLegajo, String cargo) {
		super(dni, telefono, apellido, nombre, direccion);
		this.sueldo = sueldo;
		this.numeroLegajo = numeroLegajo;
		this.cargo = cargo;
	}
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", numeroLegajo=" + numeroLegajo + ", cargo=" + cargo + ", dni=" + dni
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	
	
}
