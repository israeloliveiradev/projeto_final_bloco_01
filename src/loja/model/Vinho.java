package loja.model;

public class Vinho extends Bebidas{

	private String tipoUva;

	public Vinho(int id, String nome, int categoria, float teorAlcoolico, int quantidade, String tipoUva) {
		super(id, nome, categoria, teorAlcoolico, quantidade);
		this.tipoUva = tipoUva;
	}

	public String getUva() {
		return tipoUva;
	}

	public void setUva(String uva) {
		this.tipoUva = uva;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo da Uva: " + this.tipoUva);
	}

}
