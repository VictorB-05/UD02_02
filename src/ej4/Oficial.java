package ej4;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() +  "-> Operario -> Oficial";
			//super. se refiere directamente al padre
	}

	
	
}
