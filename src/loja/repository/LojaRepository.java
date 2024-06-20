package loja.repository;

import loja.model.Bebidas;

public interface LojaRepository {


	// CRUD DA LOJA

	public void procurarPorCategoria(int id);
	public void estoqueDisponivel();
	public void cadastrarProduto(Bebidas bebidas);
	public void atualizarProduto(Bebidas bebidas);
	public void deletar(int id);
}
