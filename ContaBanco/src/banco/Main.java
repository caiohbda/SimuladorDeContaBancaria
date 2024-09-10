package banco;
import Interfaces.IConta;

public class Main {
	public static void main(String[] args) {
		Cliente caio = new Cliente();
		caio.setNome("Caio");
		
		IConta cc = new ContaCorrente(caio);
	    IConta poupanca = new ContaPoupanca(caio);
		cc.depositar(100);
		cc.transferir(40, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
