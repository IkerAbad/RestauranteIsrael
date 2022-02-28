package Restaurante;
public class RestauranteIsrael {
	public int p;
	public int c;
	
	public RestauranteIsrael(int a, int b) {
		this.p = a;
		this.c = b;
	}
	
	int cantidadPapas() {
		int a = this.p * 3;
		return a;
	}
	
	int cantidadChocos() {
		int ch = this.c * 6;
		return ch;
	}
	
	public void addChocos(int c) {
		this.c = this.c + c;
	}
	
	public void addPapas(int d) {
		this.p = this.p + d;
	}
	
	public static void main(String[] args) {
		RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
		System.out.println("Numero de chocos: " + r1.c);
		System.out.println("Numero de papas: " + r1.p);

		if(r1.cantidadPapas() <= r1.cantidadChocos()) {
			System.out.println("Israel puede dar de comer a " + r1.cantidadPapas() + " personas");
		}
		else {
			System.out.println("Israel puede dar de comer a " + r1.cantidadChocos() + " personas");
		}
	}

}