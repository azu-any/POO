package P1;

import java.util.Random;

public class Persona extends Humano {

	private Boolean alto;
	private Boolean musica;
	private Boolean deporte;
	private Boolean hermanos;
	
	public Persona(String nombre) {
		super(nombre);
		this.setAlto(this.myBool());
		this.setMusica(this.myBool());
		this.setDeporte(this.myBool());
		this.setHermanos(this.myBool());	
	}
	
	Random random = new Random();
	
	public Boolean myBool() {
		Boolean bool = random.nextBoolean();
		return bool;
	}

	public Boolean getAlto() {
		return alto;
	}
	public void setAlto(Boolean bool) {
		this.alto = bool;
		if(this.alto == true)
			Humano.setContAlto();
	}
	
	public Boolean getMusica() {
		return musica;
	}
	public void setMusica(Boolean bool) {
		this.musica = bool;
		if(this.musica == true)
			Humano.setContMusica();
	}

	public Boolean getDeporte() {
		return deporte;
	}
	public void setDeporte(Boolean bool) {
		this.deporte = bool;
		if(this.deporte == true)
			Humano.setContDeporte();
	}
	
	public Boolean getHermanos() {
		return hermanos;
	}
	public void setHermanos(Boolean bool) {
		this.hermanos = bool;
		if(this.hermanos == true)
			Humano.setContHermanos();
	}
	
	public void printInfo() {
		System.out.println(this.getNombre());
		System.out.println("¿Es alto? " + this.getAlto());
		System.out.println("¿Practica musica? " + this.getMusica());
		System.out.println("¿Practica deporte? " + this.getDeporte());
		System.out.println("¿Tiene hermanos? " + this.getHermanos());
	}
}
