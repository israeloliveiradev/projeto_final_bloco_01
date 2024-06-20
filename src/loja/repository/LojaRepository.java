package loja.repository;

import loja.model.Bebidas;

public interface LojaRepository {



	public void procurarPorId(int id);
	public void estoqueDisponivel();
	public void cadastrarProduto(Bebidas bebidas);
	public void atualizarProduto(Bebidas bebidas);
	public void deletar(int id);
}
