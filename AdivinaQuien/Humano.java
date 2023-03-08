package P1;

public abstract class Humano {
	
	private String nombre;
	private static int contAlto = 0;
	private static int contMusica = 0;
	private static int contDeporte = 0;
	private static int contHermanos = 0;
	
	public Humano(String nombre) {
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void setContAlto() {
		contAlto++;
	}
	public static int getContAlto() {
		return contAlto;
	}
	
	public static void setContMusica() {
		contMusica++;
	}
	public static int getContMusica() {
		return contMusica;
	}
	
	public static void setContDeporte() {
		contDeporte++;
	}
	public static int getContDeporte() {
		return contDeporte;
	}
	
	public static void setContHermanos() {
		contHermanos++;
	}
	public static int getContHermanos() {
		return contHermanos;
	}
	
}
	