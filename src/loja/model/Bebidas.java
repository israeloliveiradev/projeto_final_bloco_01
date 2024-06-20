package loja.model;

public abstract class Bebidas {

	 private int id;
	    private String nome;
	    private int categoria;
	    private float teorAlcoolico;
	    private int quantidade;

	    public Bebidas(int id, String nome, int categoria, float teorAlcoolico, int quantidade) {
	        this.id = id;
	        this.nome = nome;
	        this.categoria = categoria;
	        this.teorAlcoolico = teorAlcoolico;
	        this.quantidade = quantidade;}


	public float getTeorAlcolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcolico(float teorAlcolico) {
		this.teorAlcoolico = teorAlcolico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void visualizar() {

		String categoria = " ";

		switch(this.categoria) {

		case 1:
			categoria = "Cerveja";
			break;

		case 2:
			categoria = "Vinho";

		case 3:
			categoria = "Whisky";

		case 4:
			categoria = "Vodka";

		}


		System.out.println("\n\n*****************************************************************");
		System.out.println("DADOS DA BEBIDA:                                                     ");
		System.out.println("\n\n*****************************************************************");
		System.out.println("ID: " + this.id                                                       );
		System.out.println("Nome: " + this.nome                                                   );
		System.out.println("Categoria: " + categoria                                              );
		System.out.println("Teor Alcoólico: " + this.teorAlcoolico                                );
		System.out.println("Quantidade: " + this.quantidade                                       );
		System.out.println("*********************************************************************");
	}

}


