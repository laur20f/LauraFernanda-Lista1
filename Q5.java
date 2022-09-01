package ficha1;

import java.util.Scanner;

public class Q5 {
 public static void main(String[] args) {
	 Scanner numero = new Scanner (System.in);
 
	 int a;
	 
	 System.out.println("Digite algum número:");
	 a = numero.nextInt();
	 
	 if (a%2 == 0) {
		 System.out.println("o número é par");
		 } else {
			 System.out.println("o número é impar");
	 }
 }
}
