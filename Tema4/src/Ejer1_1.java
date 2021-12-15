import java.util.Scanner;

public class Ejer1_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int operacion, cont=0, nota=0,resultado, num1,num2;
		System.out.println("Si quieres hacer sumas pulsa 1");
		System.out.println("Si quieres hacer restas pulsa 2");
		System.out.println("Si quieres hacer multiplicaiones pulsa 3");
		operacion = teclado.nextInt();
	for(cont=0;cont<10;++cont) {
			num1= (int) (Math.random()*20);
			num2= (int) (Math.random()*20);
			switch (operacion) {
				case 1: {System.out.println(num1+"+"+num2);
				resultado = teclado.nextInt();
					if(resultado == (num1+num2)) {
						System.out.println("El resultado es correcto");
						++nota;
						resultado = 50;
						}
						else System.out.println("Has fallado");
					break;}
			
				case 2:{ System.out.println(num1+"-"+num2);
				resultado = teclado.nextInt();
					if(resultado == (num1-num2)) {
						System.out.println("El resultado es correcto");
						++nota;
						resultado = 50;}
						else System.out.println("Has fallado");
					break;}	
				case 3:{ System.out.println(num1+"*"+num2);
				resultado = teclado.nextInt();
					if(resultado == (num1*num2)) {
					System.out.println("El resultado es correcto");
					++nota;
					resultado = 50;;}
					else System.out.println("Has fallado");
					break;		}
				}
	}
	System.out.println("Tu calificaión es de : " + nota);
	}}
