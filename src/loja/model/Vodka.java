package loja.model;

public class Vodka extends Bebidas{

	String localFabricacao;

	public Vodka(int id, String nome, int categoria, float teorAlcoolico, int quantidade, String localFabricacao) {
		super(id, nome, categoria, teorAlcoolico, quantidade);
		this.localFabricacao = localFabricacao;
	}

	public String getLocalFabricacao() {
		return localFabricacao;
	}

	public void setLocalFabricacao(String localFabricacao) {
		this.localFabricacao = localFabricacao;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Local Fabricação " + this.localFabricacao);
	}
}
