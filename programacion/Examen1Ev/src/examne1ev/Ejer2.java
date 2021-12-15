package examne1ev;
import java.util.Scanner;
public class Ejer2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dni,n;
		String letra;
		String le ="TRWAGMYFPDXBNJZSQVHLCKE";
		boolean correcto = false;
		while(correcto == false) {
			dni = teclado.nextInt();
			letra = teclado.next();
			letra = letra.toUpperCase();
			if(dni<100000000 && dni>0) {
				n=dni%23;
				if(letra.charAt(0)==(le.charAt(n))) {
					correcto = true;
				}
			}
		}

	}

}
