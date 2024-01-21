package ej3;

import java.util.Scanner;

public class Persona {

	
	//variables
	private String nombre;
	private String direccion;
	private int cP;
	private String ciudad;
	private Fecha fN;
	//constructor
	public Persona(String nombre, String direccion, int cP, String municipio, int dia,int mes,int anyo ) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.cP = cP;
		ciudad = municipio;
		this.fN = new Fecha(dia,mes,anyo);
	}
	
	public Persona() {
	}

	
	//geters y seters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getcP() {
		return cP;
	}

	public void setcP(int cP) {
		this.cP = cP;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Fecha getfN() {
		return fN;
	}

	public void setfN(Fecha fN) {
		this.fN = fN;
	}
	

	//metodos
	public boolean esMayorDeEdad() {
		int diaH;
		int mesH;
		int anyoH;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon el dia de hoy");
		diaH = sc.nextInt();
		
		System.out.println("Pon el mes");
		mesH = sc.nextInt();
		
		System.out.println("Pon el año");
		anyoH = sc.nextInt();
		
		Fecha fH = new Fecha(diaH,mesH,anyoH-18);
	
		return	fN.esMayorQue(fH);
	}


	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n"+
				"Fecha Nacimiento: "+ fN+ "\n"+
				"Direccion: " + direccion + "\n"+
				cP + " " + ciudad;
	}
	
	
}
