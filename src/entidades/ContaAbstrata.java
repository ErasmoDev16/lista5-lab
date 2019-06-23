package entidades;

public abstract class ContaAbstrata {

	private String numeroDaConta;
	private Double saldo;
	private Cliente cliente;

	public ContaAbstrata(String numeroDaConta, Double saldo, Cliente cliente) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public abstract Double obterLimite();

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;

	}

	public String toString() {
		return getCliente() + "N�mero da conta: " + getNumeroDaConta() + ":\nSaldo R$: " + obterLimite() + ":\n";
	}

}
