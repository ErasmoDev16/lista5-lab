package entidades;

public class Poupanca extends ContaAbstrata {

	public Poupanca(String numeroDaConta, Double saldo, Cliente cliente) {
		super(numeroDaConta, saldo, cliente);
	}

	@Override
	public Double obterLimite() {

		return getSaldo();
	}

}
