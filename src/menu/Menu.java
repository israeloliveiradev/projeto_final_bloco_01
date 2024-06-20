package menu;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.Cerveja;
import loja.model.Vinho;
import loja.model.Vodka;
import loja.model.Whisky;

public class Menu {

	public static void main(String[] args) {

		LojaController bebidas = new LojaController();

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String produto, localFabricacao, tipoUva;
		int opcao, id, categoria, quantidade, ibu, idade;
		float teorAlcoolico;

		while (true) {
			System.out.println("***************************************************************");
			System.out.println("*                                                             *");
			System.out.println("*                    CANTINHO DAS BEBIDAS                     *");
			System.out.println("*                                                             *");
			System.out.println("***************************************************************");
			System.out.println("*                                                             *");
			System.out.println("*                    1 - CADASTRAR PRODUTO                    *");
			System.out.println("*                    2 - ESTOQUE DISPONÍVEL                   *");
			System.out.println("*                    3 - BUSCAR POR ID                        *");
			System.out.println("*                    4 - ATUALIZAR PRODUTO                    *");
			System.out.println("*                    5 - DELETAR PRODUTO                      *");
			System.out.println("*                    6 - SAIR                                 *");
			System.out.println("*                                                             *");
			System.out.println("***************************************************************");
			System.out.println("DIGITE A OPÇÃO DESEJADA:                                       ");


			try {
				opcao = input.nextInt();
			} catch (InputMismatchException  e) {
				System.out.println("\nDigite Valores Inteiros\n ");
				input.nextLine();
				opcao = 0;
			}




			if (opcao == 6) {
				System.out.println("\nObrigado por visitar o Cantinho das Bebidas!\n");
				input.close();
				bebidas.sobre();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Criar um Produto:\n\n");

				System.out.println("Digite o Nome do Produto: ");
				input.skip("\\R?");
				produto = input.nextLine();

				do {
					System.out
							.println("Digite a Categoria do Produto: (1 = Cerveja, 2 = Vinho, 3 = Whisky, 4 = Vodka):");
					categoria = input.nextInt();

				} while (categoria < 1 || categoria > 4);

				System.out.println("Digite o Teor Alcoólico da bebida: ");
				teorAlcoolico = input.nextFloat();
				System.out.println("Digite a Quantidade de Itens: ");
				quantidade = input.nextInt();

				switch (categoria) {

				case 1 -> {
					System.out.println("Digite o IBU da Cerveja:");
					input.skip("\\R?");
					ibu = input.nextInt();
					bebidas.cadastrarProduto(
							new Cerveja(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, ibu));
				}

				case 2 -> {
					System.out.println("Digite o Tipo da Uva: ");
					input.skip("\\R?");
					tipoUva = input.nextLine();
					bebidas.cadastrarProduto(
							new Vinho(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, tipoUva));
				}

				case 3 -> {
					System.out.println("Digite a Idade do Whisky: ");
					input.skip("\\R?");
					idade = input.nextInt();
					bebidas.cadastrarProduto(
							new Whisky(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, idade));
				}

				case 4 -> {
					System.out.println("Digite o Local de Fabricação da Vodka: ");
					input.skip("\\R?");
					localFabricacao = input.nextLine();
					bebidas.cadastrarProduto(new Vodka(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade,
							localFabricacao));
				}

				}

				break;

			case 2:
				System.out.println("Estoque Disponível:\n\n ");
				bebidas.estoqueDisponivel();

				break;

			case 3:
				System.out.println("Buscar Por ID:\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = input.nextInt();
				bebidas.procurarPorId(id);
				break;

			case 4:
				System.out.println("Atualizar Produto:\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = input.nextInt();
				input.skip("\\R?");

				var buscaBebidas = bebidas.buscarNaCollection(id);

				if (buscaBebidas != null) {

					System.out.println("Digite o Nome do Produto: ");
					produto = input.nextLine();

					System.out.println("Digite a Categoria do Produto: ");
					categoria = input.nextInt();
					input.nextLine();

					System.out.println("Digite o Teor Alcoólico do Produto: ");
					teorAlcoolico = input.nextFloat();
					input.nextLine();

					System.out.println("Digite a Quantidade de Produtos: ");
					quantidade = input.nextInt();
					input.nextLine();

					switch (categoria) {

					case 1 -> {
						System.out.println("Digite o IBU da Cerveja:");
						input.skip("\\R?");
						ibu = input.nextInt();
						bebidas.atualizarProduto(
								new Cerveja(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, ibu));
					}

					case 2 -> {
						System.out.println("Digite o Tipo da Uva: ");
						input.skip("\\R?");
						tipoUva = input.nextLine();
						bebidas.atualizarProduto(
								new Vinho(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, tipoUva));

					}

					case 3 -> {
						System.out.println("Digite a Idade do Whisky: ");
						input.skip("\\R?");
						idade = input.nextInt();
						bebidas.atualizarProduto(
								new Whisky(bebidas.gerarId(), produto, categoria, teorAlcoolico, quantidade, idade));

					}

					case 4 -> {
						System.out.println("Digite o Local de Fabricação da Vodka: ");
						input.skip("\\R?");
						localFabricacao = input.nextLine();
						bebidas.atualizarProduto(new Vodka(bebidas.gerarId(), produto, categoria, teorAlcoolico,
								quantidade, localFabricacao));
					}

					default -> {
						System.out.println("ID INVÁLIDO!");
					}

					}

				} else
					System.out.println("O Produto não foi encontrado!");
				break;

			case 5:
				System.out.println("Deletar Produto:\n\n");
				System.out.println("Digite o ID do Produto: ");
				id = input.nextInt();
				bebidas.deletar(id);
				break;

			default:
				System.out.println("Opção Inválida!\n");
				break;

			}

		}

	}

}
