package banco;

import Interfaces.IConta;

public abstract class Conta implements IConta {
	
	private int agencia;
	private int numero;
	private double saldo;

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void transferir(double valor, Conta contadestino) {
		// TODO Auto-generated method stub
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

		
}
	


