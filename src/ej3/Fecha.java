package ej3;

public class Fecha {

	//variables
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha() {
		
	}
	public Fecha(int dia,int mes,int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public boolean fechaCorrecta() {

		if(mes==4 || mes==6 || mes==9 || mes==11 ) {
			if(dia<=30) return true;
		}
		else if (mes==2){
			if(dia<=28) return true;
			else if (dia==29 && esBisiesto()) return true;
		}
		else if (mes>12)return false;
		else if (dia<=31)return true;
		return false;
	}
	private boolean esBisiesto() {
		if(anyo%4==0) {
			if(anyo%100==0){
				if(anyo%400==0)return true;
				return false;
			}
			return true;
		}
		return false;
	}
	public void diaSiguiente() {
		this.dia=getDia()+1;
		if(fechaCorrecta());
		else {
			this.dia = 1;
			this.mes=getMes()+1;
			if(fechaCorrecta());
			else {
				this.mes = 1;
				this.anyo=getAnyo()+1;
			}
		}
	}
	
	public boolean esMayorQue(Fecha f) {
		if(this.anyo < f.anyo) return true;
		
		else if(this.anyo == f.anyo) {
			
			if(this.mes < f.mes)return true;
			
			else if(this.mes == f.mes) {
				
				if(this.dia < f.dia)return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%02d-%02d-%02d", dia , mes , anyo);
	}
	public void mostrarFecha() {
		String[] nMes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		System.out.printf("La fecha es: %02d-%s-%02d\n", dia , nMes[mes-1] , anyo);
	}
}
