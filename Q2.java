package ficha1;

import java.util.Scanner;

public class Q2 {
 public static void main (String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 float imc;
	 float peso;
	 float altura;
	 
 System.out.println("Escreva a seu peso:");
	 peso = sc.nextFloat();
	 
	 System.out.println("Escreva a sua altura");
	 altura = sc.nextFloat();
	 
	 imc =  peso / (altura * altura);
	 
	 System.out.printf("o seu IMC é: %.3f", imc);
 }
}
