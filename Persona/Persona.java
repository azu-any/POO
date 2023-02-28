package P1;

public class Persona extends Humano {
	private Boolean a1;
	private Boolean a2;
	private Boolean a3;
	private Boolean a4;
	
	public Persona(String nombre, int a, int b, int c, int d) {
		super(nombre);
		setA1(a);
		setA2(b);
		setA3(c);
		setA4(d);
		
	}

	public Boolean getA1(int a) {
		if(a==1) {
			System.out.print("¿Es alto? ");
		} else {
			System.out.print("¿Usa lentes? ");
		}
		return a1;
	}
	public void setA1(int a) {
		if(a==1) {
			setAlto();
			this.a1 = getAlto();
		} else {
			setLentes();
			this.a1 = getLentes();
		}
		
	}

	public Boolean getA2(int b) {
		if(b==3) {
			System.out.print("¿Practica musica? ");
		} else {
			System.out.print("¿Habla ingles? ");
		}
		return a2;
	}
	public void setA2(int b) {
		if(b==3) {
			setMusica();
			this.a2 = getMusica();
		} else {
			setIngles();
			this.a2 = getIngles();
		}
	}

	public Boolean getA3(int c) {
		if(c==5) {
			System.out.print("¿Practica deporte? ");
		} else {
			System.out.print("¿Es menor de edad? ");
		}
		
		return a3;
	}
	public void setA3(int c) {
		if(c==5) {
			setDeporte();
			this.a3 = getDeporte();
		} else {
			setMenor();
			this.a3 = getMenor();
		}
	}
	
	public Boolean getA4(int d) {
		if(d==7) {
			System.out.print("¿Tiene hermanos? ");
		} else {
			System.out.print("¿Trabaja? ");
		}
		
		return a4;
	}
	public void setA4(int d) {
		if(d==7) {
			setHermanos();
			this.a4 = getHermanos();
		} else {
			setTrabaja();
			this.a4 = getTrabaja();
		}
			
	}
}
