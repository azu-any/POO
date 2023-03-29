package pkg1;

public class Lector {
	
	public void ejecutar(int n) throws Exception {
		
		Data csv = new Data();
		csv.sum(csv.read(n%1000));
		csv.write(Integer.toString(n));
	}

}
