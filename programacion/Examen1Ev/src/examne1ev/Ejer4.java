package examne1ev;
import java.util.Scanner;
public class Ejer4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,m;
		String correo,pl,dom;
		String letra;
		boolean correcto = false;
		while(correcto == false) {
		correo = teclado.next();
		correo = correo.toUpperCase();
		pl = correo.substring(0,correo.indexOf("@")-1);
		dom = correo.substring(correo.indexOf("@")+1,correo.length());
		if(correo.indexOf("@")<=64) {
		if(correo.indexOf("@")+dom.length()<=254) {
		m= pl.length();
		letra=("");
		correcto = true;
		for(n=0;n<m && correcto == true;++n) {
			if(pl.charAt(n)>='A' && pl.charAt(n)<='Z' )correcto = true;
			else correcto = false;
			if(pl.charAt(n)>='0' || pl.charAt(n)<='9' )correcto = true;
			else correcto = false;
			if(pl.charAt(n)=='.') {
			correcto = true;
			if(letra.equals("."))correcto = false;
			if(n==0)correcto = false;
			}
			if(pl.charAt(n)=='-' || pl.charAt(n)=='_' )correcto = true;
			letra=("");
			letra+=pl.charAt(n);	
		}
		if(correcto==true) {
		m= dom.length();
		for(n=0;n<m && correcto == true;++n) {
			if(dom.charAt(n)>='A' && dom.charAt(n)<='Z' )correcto = true;
			else correcto = false;
			if(dom.charAt(n)>='0' || dom.charAt(n)<='9' )correcto = true;
			else correcto = false;
			if(dom.charAt(n)=='.') {
				correcto = true;
				if(n==m-1)correcto = false;
				}
			if(dom.charAt(n)=='-')correcto = true;	
			
		}
		}
		if(correcto == false)System.out.println("falso");
		if(correcto == true)System.out.println("correcto");
		}
		}
		}

	}

}
