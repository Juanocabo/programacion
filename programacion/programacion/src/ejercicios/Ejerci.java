package ejercicios;

import java.util.Scanner;

public class Ejerci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, suma= 0, i = 1,c=0, me = 0 , ma = 0, ant=0;
		while(i != 0) {
			n= teclado.nextInt();
			i = n;
			if(i != 0) {
				if(n>=ma) ma = n;
				if(n<ant|| ant == 0) me=n;
				suma = suma + n;
				++c;
				ant=n;
			}
		}
		System.out.print("la media de estos numeros es: " + (float)suma/c+ " y el mayor y el menor son respectivamente:"+ ma +" "+ me);
	}

}
