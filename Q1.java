package ficha1;

import java.util.Scanner;

public class Q1 {
	
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	 

	int a;
	float b;
	long c;
	 
	System.out.println("Digite um número int:");
	a = ler.nextInt();
	
	System.out.println("Digite um número long:");
	b = ler.nextFloat();
	
	System.out.println("Digite um número float:");
	c = ler.nextLong();
	
	 System.out.println("O número inteiro foi:" + a +", o número long foi:" + b + ", por fim o número float é:" + c);
	
}
} 