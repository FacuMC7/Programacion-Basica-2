package pb2a;

//Una clase abstract no puede ser instanciada

public abstract class Persona {

	int dni;
	int telefono;
	String direccion;
	String nombre;
	String apellido;
	
	public Persona() {
		
	}

	public Persona(int dni, int telefono, String apellido, String nombre, String direccion) {
		this.dni = dni;
		this.apellido = apellido;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}
	
	public void ascenso() {
		System.out.println("Obtiene un ascenso");
	}
	
	public void despedida() {
		System.out.println("Fue despedido...");
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
