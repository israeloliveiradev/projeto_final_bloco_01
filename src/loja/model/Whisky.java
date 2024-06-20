package loja.model;

public class Whisky extends Bebidas {

	int idade;

	public Whisky(int id, String nome, int categoria, float teorAlcoolico, int quantidade, int idade) {
		super(id, nome, categoria, teorAlcoolico, quantidade);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void visualizar(){
		super.visualizar();
		System.out.println("Idade: " + this.idade);

	}

}
