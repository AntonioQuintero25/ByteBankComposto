

public class Conta{
	//Para especificar um valor faça igual abaixo:
	//int agencia = 42;
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	//pode ser assim tbm: Cliente titular = new Cliente;
	
	public double depositar(double valor){
		System.out.println("Foi depositado na sua conta "+valor);
		return this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
		 this.saldo -= valor;
		 System.out.println("Foi retirado da sua conta "+valor+" seu saldo é: "+this.saldo);
		 return true;
		}else {
			System.out.println("Você não tem saldo suficiente");
			return false;
		}

	}
	
	public boolean transferencia(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			destino.depositar(valor);
			System.out.println("Transferencia feita com sucesso!");
			return true;
		}else {
			System.out.println("Você não possui saldo suficiente");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}