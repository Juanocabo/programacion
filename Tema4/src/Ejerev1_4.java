
import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ejerev1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine() + " ";
		String palabra = teclado.next();
		String palabrat= ("") ;
		texto=texto.toLowerCase();
		palabra=palabra.toLowerCase();
		int n=0,m,c=0,a=0;
		for(m=palabra.length();n!=m && m<=80 && a==0;++n) {
			if(palabra.charAt(n)<'a' || palabra.charAt(n)>'z') {
				if(palabra.charAt(n)<'0' || palabra.charAt(n)>'9')a+=2;
			}
		}
		n=0;
		while(a==0) {
		for(m = texto.length();n!=m && texto.charAt(n)!=' ';++n){
			
		palabrat =  (palabrat + texto.charAt(n));
		}
		if(palabrat.equals(palabra) == true) {
			++c;
		}
		++n;
		palabrat=("");
		if(n==m) ++a;
		}
		if(a==1)System.out.print("la palabra seleccionada sale un total de "+c+" veces");
		if(a==2)System.out.print("la palabra contiene un caracter erroneo");
	}

}