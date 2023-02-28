package P1;

import java.util.Random;

public abstract class Humano {
	
	private String nombre;
	private Boolean alto;
	private Boolean lentes;
	private Boolean ingles;
	private Boolean musica;
	private Boolean deporte;
	private Boolean menor;
	private Boolean hermanos;
	private Boolean trabaja;
	
	private static int contAlto = 0;
	private static int contLentes = 0;
	private static int contIngles = 0;
	private static int contMusica = 0;
	private static int contDeporte = 0;
	private static int contMenor = 0;
	private static int contHermanos = 0;
	private static int contTrabaja = 0;
	
	Random random = new Random();
	
	
	public Humano(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getAlto() {
		return alto;
	}
	public void setAlto() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.alto = true;
			contAlto++;
		} else {
			this.alto = false;
		}
	}

	public Boolean getLentes() {
		return lentes;
	}
	public void setLentes() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.lentes = true;
			contLentes++;
		} else {
			this.lentes = false;
		}
	}

	public Boolean getIngles() {
		return ingles;
	}
	public void setIngles() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.ingles = true;
			contIngles++;
		} else {
			this.ingles = false;
		}
	}

	public Boolean getMusica() {
		return musica;
	}
	public void setMusica() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.musica = true;
			contMusica++;
		} else {
			this.musica = false;
		}
	}

	public Boolean getDeporte() {
		return deporte;
	}
	public void setDeporte() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.deporte = true;
			contDeporte++;
		} else {
			this.deporte = false;
		}
	}

	public Boolean getHermanos() {
		return hermanos;
	}
	public void setHermanos() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.hermanos = true;
			contHermanos++;
		} else {
			this.hermanos = false;
		}
	}

	public Boolean getMenor() {
		return menor;
	}
	public void setMenor() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.menor = true;
			contMenor++;
		} else {
			this.menor = false;
		}
	}

	public Boolean getTrabaja() {
		return trabaja;
	}
	public void setTrabaja() {
		int randomNumber = random.nextInt(2);
		if(randomNumber == 1) {
			this.trabaja = true;
			contTrabaja++;
		} else {
			this.trabaja = false;
		}
	}
	
	public static int getContAlto() {
		return contAlto;
	}
	public static int getContLentes() {
		return contLentes;
	}
	public static int getContIngles() {
		return contIngles;
	}
	public static int getContMusica() {
		return contMusica;
	}
	public static int getContDeporte() {
		return contDeporte;
	}
	public static int getContMenor() {
		return contMenor;
	}
	public static int getContHermanos() {
		return contHermanos;
	}
	public static int getContTrabaja() {
		return contTrabaja;
	}
	
}
