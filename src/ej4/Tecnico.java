package ej4;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return super.toString() +  "-> Operario -> Oficial";
			//super. se refiere directamente al padre
	}

	
	
}
