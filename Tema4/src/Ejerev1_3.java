import java.util.Scanner;

/**
 * 
 */

/**
 * @author alu
 *
 */
public class Ejerev1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d = teclado.nextInt(),m = teclado.nextInt(),a = teclado.nextInt(),semana,bisi=0/**0bsiesto 1 no*/;
		if(a%4==0) {
			if(a==(a/100)*100){
				if(a%400==0);
				else;
			}
			else;
		}
		if ( m%2==0 ){
			if(m==2)/**February*/;
			if ( m>7 )/**31*/;
			if (m<=7 && m!=2)/**30*/;
			}
		if ( m%2!=0 ){
			if ( m>7 )/**30*/;
			if (m<=7)/**31*/;
			}
		
		if ( m <= 2 ) {
			m = m+12;
			a = a-1;
			}
			semana = ((d+2*m+3*(m+1)/5+a+a/4-a/100+a/400+2)%7);
			System.out.println(semana);
	}

}
