package principal;

import entidades.BancoNovaRoma;
import entidades.Cliente;
import entidades.ContaAbstrata;
import entidades.IBancoGeral;

public class Teste {

	public static void main(String[] args) {

		IBancoGeral banco = new BancoNovaRoma();

		ContaAbstrata c1 = banco.abrirConta(new Cliente("Erasmo", "3843793479"), "288383", 0, "Poupan�a");
		if (banco.depositar(c1, 1)) {
			System.out.println(c1);
		} else {
			System.out.println("N�o foi possivel identificar o valor !\n\n");
		}

		ContaAbstrata c2 = banco.abrirConta(new Cliente("Carlos", "56433434379"), "288383", 1500, "Corrente");
		if (banco.sacar(c2, 500)) {
			System.out.println(c2);
		} else {
			System.out.println("Saldo insuficiente !\n\n");
		}

	}

}
