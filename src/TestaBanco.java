
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo";
		paulo.cpf = "78965412398";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		
		contaDoPaulo.depositar(100);
		contaDoPaulo.depositar(50);
		contaDoPaulo.getSaldo();
	}
}
