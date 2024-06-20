package loja.model;

public class Cerveja extends Bebidas {

	private int amargor;

	public Cerveja(int id, String nome, int categoria, float teorAlcoolico, int quantidade, int amargor) {
		super(id, nome, categoria, teorAlcoolico, quantidade);
		this.amargor = amargor;
	}

	public int getAmargor() {
		return amargor;
	}

	public void setAmargor(int amargor) {
		this.amargor = amargor;
	}


	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de Amargor: " + this.amargor);
	}
}