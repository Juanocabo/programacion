package ejercicios;
import java.util.Scanner;
public class examen1_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n =teclado.nextInt(),n1,n2,espacios;
		for(n1=0;n1<n; ++n1) {
			for(espacios=0;espacios<=n-n1;++espacios) {
				System.out.print(" ");
			}
			for(n2=0; n2<=n1;++n2) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
