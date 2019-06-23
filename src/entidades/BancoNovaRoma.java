package entidades;

public class BancoNovaRoma implements IBancoGeral {

	@Override
	public ContaAbstrata abrirConta(Cliente c, String numeroConta, double saldoInicial, String tipo) {
		if (tipo == "Poupan�a") {
			return new Poupanca(numeroConta, saldoInicial, c);
		}
		return new ContaCorrente(numeroConta, saldoInicial, c);
	}

	@Override
	public boolean depositar(ContaAbstrata c, double valor) {
		if (valor > 0) {
			c.depositar(valor);

			return true;
		}
		return false;
	}

	@Override
	public boolean sacar(ContaAbstrata c, double valor) {
		if (valor <= c.obterLimite()) {
			c.sacar(valor);
			return true;
		}
		return false;
	}

}
