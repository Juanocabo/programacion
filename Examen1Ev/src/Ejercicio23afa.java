import java.util.Scanner;

public class Ejercicio23afa {

	public static void main(String[] args) {
		int d=0,d1;
		int m=0;
		int a=0;
		
		int d_hoy=0;
		int m_hoy=0;
		int a_hoy=0;
		
		boolean bisiesto=false;
		int dias_mes=0;
		int d_total=1;
		
		//FECHA NACIMIENTO:
		Scanner teclado=new Scanner(System.in);
		System.out.println("año (nacimiento)");
		a=teclado.nextInt();
	
		System.out.println("mes (nacimiento)");
		m=teclado.nextInt();
		
		System.out.println("dia (nacimiento)");
		d=teclado.nextInt();
		d1=d;
		
		//FECHA HOY:
				
				System.out.println("año de hoy:");
				a_hoy=teclado.nextInt();
			
				System.out.println("mes de hoy:");
				m_hoy=teclado.nextInt();
				
				System.out.println("dia de hoy:");
				d_hoy=teclado.nextInt();
		
		for(d_total=0;a<a_hoy;d_total++) {
			
			// AÑO BISIESTO:
			if(a%4==0) {
				bisiesto=true;
			}
			else {
				bisiesto=false;
			}
			
			//DÍAS MES:
			if(m%2!=0 && m<=7 || m%2==0 && m>7) {
				dias_mes=31;
			}
			else {
				if(m==2){
					if(bisiesto=true) {
						dias_mes=29;
					}
					else{
						dias_mes=28;
					}
				}
				else {
					dias_mes=30;
				}
				
			}
		
			
			//INCREMENTO MES Y AÑO:
			if(d==dias_mes) {
				if(m==12) {
					d=1;
					m=1;
					a+=1;	
				}
				else{
					d=1;
					m+=1;
				}
			}
			else {	
				d+=1;;	
			}
		}
		/*if(m<=m_hoy) {*/
		for(d_total=d_total+0;m!=m_hoy;d_total++) {
			
			// AÑO BISIESTO:
			if(a%4==0) {
				bisiesto=true;
			}
			else {
				bisiesto=false;
			}
			
			//DÍAS MES:
			if(m%2!=0 && m<=7 || m%2==0 && m>7) {
				dias_mes=31;
			}
			else {
				if(m==2){
					if(bisiesto=true) {
						dias_mes=29;
					}
					else{
						dias_mes=28;
					}
				}
				else {
					dias_mes=30;
				}
			}
		
			
			//INCREMENTO MES:
			if(d==dias_mes) {
				d=1;
				m+=1;
				if(a<a_hoy&&m==12)a+=1;
			}
			
			else {	
				d+=1;;	
			}
		}
		d_total+=d_hoy-d1-2;
		
		/*for(d_total=d_total+0;d!=d_hoy;d_total++) {
			
			// AÑO BISIESTO:
			if(a%4==0) {
				bisiesto=true;
			}
			else {
				bisiesto=false;
			}
			esto no sirve es mejor el otro
			//DÍAS MES:
			if(m%2!=0 && m<=7 || m%2==0 && m>7) {
				dias_mes=31;
			}
			else {
				if(m==2){
					if(bisiesto=true) {
						dias_mes=29;
					}
					else{
						dias_mes=28;
					}
				}
				else {
					dias_mes=30;
				}
			}
		
			
			//INCREMENTO MES:
			if(d==dias_mes) {
				d=1;
				m+=1;
			}
			
			else {	
				d+=1;;	
			}
		}*/
		System.out.println("Los dias transcurridos son: "+d_total+"klk");


	}

}
