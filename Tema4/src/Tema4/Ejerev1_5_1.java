
package Tema4;

import java.util.Scanner;

/**
 * @author juano
 *
 */
public class Ejerev1_5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resu = ("") , inicia=("tirar"),ini;
		int num,cont,dinero=10;
		System.out.println("tienes actualmente "+dinero+" euros, cada tirada cuesta 1");
		System.out.println("escribe \"tirar\" si deseas tirar o cualquier otra tecla si no");
		ini= teclado.next();
		if(inicia.equals(ini)) {
		do{
		for(cont=0;cont<3;++cont) {
		num = (int) (Math.random()*10);
		switch (num) {
		case 0:
			resu=resu+"$";break;
		case 1:
			resu=resu+"#";break;
		case 2:
			resu=resu+"%";break;
		case 3:
			resu=resu+"<";break;
		case 4:
			resu=resu+">";break;
		case 5:
			resu=resu+"@";break;
		case 6:
			resu=resu+"$";break;
		case 7:
			resu=resu+"$";break;
		case 8:
			resu=resu+"@";break;
		case 9:
			resu=resu+"@";break;
		}
		}
		cont=0;
		System.out.println(resu);
		if(resu.equals("$$$")) {
			System.out.println("ganas 25 euros");
			dinero+=25;}
		else if(resu.equals("$@@")) {
			System.out.println("ganas 50 euros");
			dinero+=50;}
		else if(resu.equals("$##")) {
			System.out.println("ganas 15 euros");
			dinero+=15;}
		else if(resu.equals("@@@")) {
			System.out.println("ganas 10 euros");
			dinero+=10;}
		else if(resu.equals("@##")) {
			System.out.println("ganas 5 euros");
			dinero+=5;}
		else if(resu.equals("@$$")) {
			System.out.println("ganas 3 euros");
			dinero+=3;}
		else if(resu.equals("###")) {
			System.out.println("ganas 1 euro");
			dinero+=1;}
		else if(resu.equals("%%%")) {
			System.out.println("ganas 1 euro");
			dinero+=1;}
		else if(resu.equals("<<<")) {
			System.out.println("ganas 1 euro");
			dinero+=1;}
		else if(resu.equals(">>>")) {
			System.out.println("ganas 1 euro");
			dinero+=1;}
		else if(resu.equals("$@%")) {
			System.out.println("ganas 1 euro");
			dinero+=1;}
		else System.out.println("has perdido");
		resu=("");
		--dinero;
		System.out.println("tienes actualmente "+dinero+" euros, cada tirada cuesta 1");
		System.out.println("escribe \"tirar\" si deseas tirar o cualquier otra tecla si no");
		ini= teclado.next();
		}while(inicia.equals(ini) && dinero>0);	
	}
		System.out.println("Gracias por jugar");
	}
	}