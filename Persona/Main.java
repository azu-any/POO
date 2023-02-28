package P1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int a = random.nextInt(1, 3);
		int b = random.nextInt(3, 5);
		int c = random.nextInt(5, 7);
		int d = random.nextInt(7, 9);

		Persona myPerson = new Persona("Juan", a, b, c, d);
		
		System.out.println(myPerson.getNombre());
		System.out.println(myPerson.getA1(a));
		System.out.println(myPerson.getA2(b));
		System.out.println(myPerson.getA3(c));
		System.out.println(myPerson.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson2 = new Persona("Ana", a, b, c, d);
		
		System.out.println(myPerson2.getNombre());
		System.out.println(myPerson2.getA1(a));
		System.out.println(myPerson2.getA2(b));
		System.out.println(myPerson2.getA3(c));
		System.out.println(myPerson2.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson3 = new Persona("Maria", a, b, c, d);
		
		System.out.println(myPerson3.getNombre());
		System.out.println(myPerson3.getA1(a));
		System.out.println(myPerson3.getA2(b));
		System.out.println(myPerson3.getA3(c));
		System.out.println(myPerson3.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson4 = new Persona("Pedro", a, b, c, d);
		
		System.out.println(myPerson4.getNombre());
		System.out.println(myPerson4.getA1(a));
		System.out.println(myPerson4.getA2(b));
		System.out.println(myPerson4.getA3(c));
		System.out.println(myPerson4.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson5 = new Persona("Diego", a, b, c, d);
		
		System.out.println(myPerson5.getNombre());
		System.out.println(myPerson5.getA1(a));
		System.out.println(myPerson5.getA2(b));
		System.out.println(myPerson5.getA3(c));
		System.out.println(myPerson5.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson6 = new Persona("Emilio", a, b, c, d);
		
		System.out.println(myPerson6.getNombre());
		System.out.println(myPerson6.getA1(a));
		System.out.println(myPerson6.getA2(b));
		System.out.println(myPerson6.getA3(c));
		System.out.println(myPerson6.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson7 = new Persona("Michelle", a, b, c, d);
		
		System.out.println(myPerson7.getNombre());
		System.out.println(myPerson7.getA1(a));
		System.out.println(myPerson7.getA2(b));
		System.out.println(myPerson7.getA3(c));
		System.out.println(myPerson7.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson8 = new Persona("Yael", a, b, c, d);
		
		System.out.println(myPerson8.getNombre());
		System.out.println(myPerson8.getA1(a));
		System.out.println(myPerson8.getA2(b));
		System.out.println(myPerson8.getA3(c));
		System.out.println(myPerson8.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson9 = new Persona("Victor", a, b, c, d);
		
		System.out.println(myPerson9.getNombre());
		System.out.println(myPerson9.getA1(a));
		System.out.println(myPerson9.getA2(b));
		System.out.println(myPerson9.getA3(c));
		System.out.println(myPerson9.getA4(d));
		
		System.out.println();
		
		a = random.nextInt(1, 3);
		b = random.nextInt(3, 5);
		c = random.nextInt(5, 7);
		d = random.nextInt(7, 9);
		Persona myPerson10 = new Persona("Jose", a, b, c, d);
		
		System.out.println(myPerson10.getNombre());
		System.out.println(myPerson10.getA1(a));
		System.out.println(myPerson10.getA2(b));
		System.out.println(myPerson10.getA3(c));
		System.out.println(myPerson10.getA4(d));
		
		System.out.println();
		
		System.out.println("Son altos: " + Humano.getContAlto());
		System.out.println("Usan lentes: " + Humano.getContLentes());
		System.out.println("Hablan ingles: " + Humano.getContIngles());
		System.out.println("Practican musica: " + Humano.getContMusica());
		System.out.println("Practican deporte: " + Humano.getContDeporte());
		System.out.println("Son menores de edad: " + Humano.getContMenor());
		System.out.println("Tienen hermanos: " + Humano.getContHermanos());
		System.out.println("Trabajan: " + Humano.getContTrabaja());


	}

}
