package ejercicios;

import java.util.Scanner;

public class Ejer3sinvalidaciones {
		public static void main (String[] args) {
			Scanner teclado = new Scanner(System.in);
			int d1,d2,m1,m2,a1,a2,cont,n=0,nb=0;
			d1=teclado.nextInt();
			m1=teclado.nextInt();
			a1=teclado.nextInt();
			d2=teclado.nextInt();
			m2=teclado.nextInt();
			a2=teclado.nextInt();
			for(cont=0;a1<a2;++a1) {
				if(a1%4==0) {cont+=366;}
				else cont+=365;
			}
				for(n=1;n<m1;++n) {
					if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)cont-=31;
					else if(n == 2)cont-=28;
					else if(n==4 || n==6 || n==9 || n==11)cont-=30;
					}
				for(n=1;n<m2;++n) {
					if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)cont+=31;
					else if(n == 2)cont+=28;
					else if(n==4 || n==6 || n==9 || n==11)cont+=30;
				
		}cont+=d2-d1;
			System.out.println(cont);
			}
	}