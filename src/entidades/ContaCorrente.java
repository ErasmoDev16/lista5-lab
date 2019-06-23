package entidades;

public class ContaCorrente extends ContaAbstrata {

	public ContaCorrente(String numeroDaConta, Double saldo, Cliente cliente) {
		super(numeroDaConta, saldo, cliente);
	}

	private Double chequeEspecial = 500.00;

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	@Override
	public Double obterLimite() {

		return getSaldo() + chequeEspecial;
	}

}
