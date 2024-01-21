package ej2;

import java.util.Scanner;

public class Nif {
	private int DNI;
	private char lDNI;
	private final char[] letrasDNI  = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
	public Nif() {
		
	}
	public Nif(int DNI) {
		setDNI(DNI);
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int DNI) {
		this.DNI = DNI;
		lDNI = letrasDNI[DNI%23];
	}

	public void leer() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Escribe el DNI:");
		setDNI(sc.nextInt());
		System.out.println("La letra del dni es: "+letrasDNI[DNI%23]);
	}
	@Override
	public String toString() {
		return "DNI=" + DNI + "-" + lDNI;
	}
	
}
