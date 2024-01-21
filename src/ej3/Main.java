package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		String nombre;
		String direccion;
		int cP;
		String ciudad;
		int fNdia;
		int fNmes;
		int fNanyo;
		//array de personas
		Persona[ ] E = new Persona[2];
		// inroduccion de datos por el usuario a las clases personas
		for(int i = 0; i<E.length;i++) {
			
			System.out.println("Introduce el nombre de la persona");
			nombre = scLine();
			System.out.println("Introduce el direccion de la persona");
			direccion = scLine();
			System.out.println("Introduce el codigo postal de la persona");
			cP = sc2.nextInt();
			System.out.println("Introduce la ciudad de la persona");
			ciudad = scLine();
			System.out.println("Introduce la fecha de nacimiento de la persona dia ");
			fNdia = sc3.nextInt();
			System.out.println("Introduce la fecha de nacimiento de la persona mes ");
			fNmes = sc2.nextInt();
			System.out.println("Introduce la fecha de nacimiento de la persona anyo ");
			fNanyo = sc3.nextInt();
			E[i]  = new Persona(nombre, direccion, cP, ciudad, fNdia, fNmes, fNanyo);
			
		}
		
	
		// salida de las personas por el metodo toString();
		System.out.println(E[0]);
		System.out.println();
		System.out.println(E[1]);

		
		}

	
	private static String scLine() {
		Scanner sc = new Scanner(System.in);
		
		String line =sc.nextLine();

		return line;
	}
	
}
