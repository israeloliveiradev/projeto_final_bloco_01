package loja.controller;

import java.util.ArrayList;

import loja.model.Bebidas;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {

	private ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
	int id = 0;

	@Override
	public void procurarPorId(int id) {

		var bebidas = buscarNaCollection(id);

		if (bebidas != null)
			bebidas.visualizar();

		else
			System.out.println("\nA Bebida com o ID " + id + " não foi encontrada!");

	}

	@Override
	public void estoqueDisponivel() {
		for (var bebidas : listaBebidas) {
			bebidas.visualizar();
		}
	}

	@Override
	public void cadastrarProduto(Bebidas bebidas) {
		listaBebidas.add(bebidas);
		System.out.println(
				bebidas.getQuantidade() + " unidades de " + bebidas.getNome() + " foram adicionados(a) com sucesso!");

	}

	@Override
	public void atualizarProduto(Bebidas bebidas) {
		var buscaBebidas = buscarNaCollection(bebidas.getId());

		if (buscaBebidas != null) {
			listaBebidas.set(listaBebidas.indexOf(buscaBebidas), bebidas);
			System.out.println("\nO produto " + bebidas.getNome() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto " + bebidas.getNome() + "não foi encontrado! ");

	}

	@Override
	public void deletar(int id) {
		var bebidas = buscarNaCollection(id);

		if (bebidas != null) {
			if (listaBebidas.remove(bebidas) == true);
			System.out.println("\nO produto " + id + " foi excluido com sucesso!");

		} else
			System.out.println("\nO produto " + id + " não foi encontrado!");
	}

	public int gerarId() {
		return ++id;

	}

	public Bebidas buscarNaCollection(int id) {
		for (var bebidas : listaBebidas) {
			if (bebidas.getId() == id) {
				return bebidas;
			}
		}

		return null;

	}

	public static void sobre() {

		System.out.println("*********************************************************");
		System.out.println("* Projeto Desenvolvido por: Israel Oliveira             *");
		System.out.println("* Israel Oliveira - linkedin.com/in/israeloliveiradev/  *");
		System.out.println("* github.com/israeloliveiradev                          *");
		System.out.println("*********************************************************");
	}

}
