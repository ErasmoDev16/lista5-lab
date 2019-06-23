package entidades;

public class Cliente {

	private String nome, CPF;


	public Cliente(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}
	
	public String toString() {
		return "Cliente: "+nome+":\nCPF: "+CPF+":\n";
	}

}
