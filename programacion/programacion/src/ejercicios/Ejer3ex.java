package ejercicios;

import java.util.Scanner;
public class Ejer3ex {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d1,d2,m1,m2,a1,a2,cont,n=0;//n es un contador de control de bucles y cont sera el contador total de dias
		boolean correcto = true;
		d1=teclado.nextInt();
		m1=teclado.nextInt();
		a1=teclado.nextInt();
		d2=teclado.nextInt();
		m2=teclado.nextInt();
		a2=teclado.nextInt();
		//VALIDACION DE QUE EL DIA O EL MES NO ES 0
		if(d1>0 || d2>0 || m1>0|| m2>0) {
			//VALIDACION DE QUE LA FECHA 1 ES POSIBLE
		if(m1==1 || m1==3 || m1==5 || m1==7 || m1==8 || m1==10 || m1==12) {
			if(d1>31)correcto=false;
		}
		else if(m1 == 2) {
			if(a1%4==0 ) {
				if(a1%100==0) {
					if(a1%400==0&&d1>29)correcto=false;
					else if(d1>28)correcto=false;
					}
				else if(d1>29)correcto=false;;
				}
			else if(d1>28)correcto=false;
		}
		else if(m1==4 || m1==6 || m1==9 || m1==11){
			if(d1>30)correcto=false;
		}
		else correcto=false;
		if(correcto==true) {
			//VALIDACION DE QUE LA FECHA 2 ES POSIBLE
			if(m2==1 || m2==3 || m2==5 || m2==7 || m2==8 || m2==10 || m2==12) {
				if(d2>31)correcto=false;
			}
			else if(m2 == 2) {
				if(a2%4==0 ) {
					if(a2%100==0) {
						if(a2%400==0&&d2>29)correcto=false;
						else if(d2>28)correcto=false;
						}
					else if(d2>29)correcto=false;;
					}
				else if(d2>28)correcto=false;
			}
			else if(m2==4 || m2==6 || m2==9 || m2==11){
				if(d2>30)correcto=false;
			}
			else correcto=false;
			//VALIDACION DE QUE LA PRIMERA FECHA ES MENOR QUE LA SEGUNDA
			if(correcto==true) {
				if(a1<=a2) {
					if(a1==a2) {
						if(m1<=m2) {
							if(m1==m2) {
								if(d1>d2)correcto = false;
							}
						}
						else correcto = false;
					}
				}
				else correcto = false;
			}
		}
		}
		else correcto=false;
				if(correcto == true) {
		System.out.print("El tiempo transcurrido entre "+d1+"/"+m1+"/"+a1+" y "+d2+"/"+m2+"/"+a2+" es de: ");
		//CUENTA LOS DIAS DESDE EL 1/1/DEL PRIMER A�O AL 1/1/DEL SEGUNDO A�O
		for(cont=0;a1<a2;++a1) {
			if(a1%4==0 ) {
				if(a1%100==0) {
					if(a1%400==0)cont+=366;
					else cont+=365;
					}
				else cont+=366;
				}
			else cont+=365;
		}
		//RESTA LOS MESES QUE YA HAN PASADO DEL A�O EN LA PRIMERA FECHA
		for(n=1;n<m1;++n) {
			if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)cont-=31;
			else if(n == 2)cont-=28;
			else if(n==4 || n==6 || n==9 || n==11)cont-=30;
		}
		//SUMA LOS MESES QUE YA HAN PASADO DEL A�O EN LA SEGUNDA FECHA
		for(n=1;n<m2;++n) {
			if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)cont+=31;
			else if(n == 2)cont+=28;
			else if(n==4 || n==6 || n==9 || n==11)cont+=30;
		}
		//RESTA LOS DIAS QUE HAN PASADO DE LA PRIMERA FECHA Y SUMA LOS DE LA SEGUNDA
		cont+=d2-d1;
		System.out.println(cont+" d�as");
		}
				else System.out.println("Alguna de las fechas introducidas es err�nea");
	}
}