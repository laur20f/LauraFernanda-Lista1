package ficha1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
	
 Scanner sc = new Scanner(System.in);
 float area;
 float basemaior;
 float basemenor;
 float altura;
 
System.out.println("Escreva a sua base maior:");
basemaior = sc.nextFloat();

System.out.println("Escreva a sua base maior:");
basemenor = sc.nextFloat();

System.out.println("Escreva a sua altura:");
altura = sc.nextFloat();

area = (basemaior + basemenor) * altura/2;

System.out.printf(" A sua área é: %.3f", area);
}
}