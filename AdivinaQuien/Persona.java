package P1;

import java.util.Random;

public class Persona extends Humano {

	private Boolean alto;
	private Boolean musica;
	private Boolean deporte;
	private Boolean hermanos;
	
	public Persona(String nombre) {
		super(nombre);
		setAlto();
		setMusica();
		setDeporte();
		setHermanos();
		
	}
	
	Random random = new Random();

	public Boolean getAlto() {
		return alto;
	}
	public void setAlto() {
		Boolean bool = random.nextBoolean();
		this.alto = bool;
		if(this.alto == true)
			Humano.setContAlto();
	}
	

	public Boolean getMusica() {
		return musica;
	}
	public void setMusica() {
		Boolean bool = random.nextBoolean();
		this.musica = bool;
		if(this.musica == true)
			Humano.setContMusica();
	}

	public Boolean getDeporte() {
		return deporte;
	}
	public void setDeporte() {
		Boolean bool = random.nextBoolean();
		this.deporte = bool;
		if(this.deporte == true)
			Humano.setContDeporte();
	}
	//random.nextboolean

	public Boolean getHermanos() {
		return hermanos;
	}
	public void setHermanos() {
		Boolean bool = random.nextBoolean();
		this.hermanos = bool;
		if(this.hermanos == true)
			Humano.setContHermanos();
	}
	
	
}
