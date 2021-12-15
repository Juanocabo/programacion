package examne1ev;
import java.util.Scanner;
public class Ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt(),n1,i,ii;
		if(n>0) {
			System.out.println("N="+n);
			System.out.println();
			for(i=0;i<n;++i) {
				for(n1=n-i;n1>1;--n1) {
					System.out.print(" ");
				}
				for(ii=0;ii<=i;++ii) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}
