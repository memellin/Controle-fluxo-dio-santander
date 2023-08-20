package user.enock.main;

import java.util.Scanner;

import user.enock.cont.Contador;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int parametro1 = sc.nextInt();
		
		System.out.println("Digite o segundo parâmetro: ");
		int parametro2 = sc.nextInt();
		
		try {
			Contador cont = new Contador();
			cont.contar(parametro1, parametro2);
		} 
		catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		sc.close();
	}
}
