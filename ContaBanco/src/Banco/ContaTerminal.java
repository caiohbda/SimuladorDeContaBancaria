package Banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main (String[] args) throws Exception {
		
		System.out.println("Olá, bem-vindo ao sistema de banco, vamos criar sua conta!!");
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite o Número da conta: ");
		int numero = scanner.nextInt();
		scanner.nextLine();	
		
		System.out.print("Digite a sua agência: ");
		String agencia = scanner.nextLine();
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o saldo inicial: ");
		Double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
	}
}
