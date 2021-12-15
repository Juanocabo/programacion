package examne1ev;

import java.util.Scanner;

public class Ejer4e {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,cont=0;
		String correo,dom;
		final String corre=("QWERTYUIOPASDFGHJKLÑZCXVBNM.-_");
		boolean correcto=true;
		do{
			System.out.println("Introduce una de direccion de correo válida");
			correo = teclado.next();
			correo = correo.toUpperCase();
			if((correo.indexOf("@")<=64 && correcto==true)||correo.length()<=254 && correo.length()>0) {
				for(n=0;n<correo.length() && correcto == true;++n) {
					if(corre.indexOf(correo.charAt(n))>=0)correcto=true;
					if(n==0||n==correo.length()-1&&correo.charAt(n)=='.')correcto=false;
				}
				dom = correo.substring(correo.indexOf("@")+1,correo.length());
				if(correo.indexOf("..")>0||dom.indexOf("_")>0)correcto=false;
				if(correcto==true) {
					for(n=0;n<dom.length() && correcto == true;++n) {
						if(corre.indexOf(dom.charAt(n))>=0)correcto=true;
						else correcto = false;
						if(dom.charAt(n)=='.')cont=0;
						++cont;
						if(cont>63)correcto=false;	
					}
				}
			}
			if(correcto == false)System.out.println("La direccion de correo es invalida");
			if(correcto == true)System.out.println("La direccion de correo es valida");
		}while(!correcto);
	}
}