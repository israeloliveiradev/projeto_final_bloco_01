package menu;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String produto;
		int opcao, id, categoria, quantidade;

		while (true) {
			System.out.println("***************************************************************");
			System.out.println("*                                                             *");
			System.out.println("*                   CANTINHO DAS BEBIDAS                      *");
			System.out.println("*                                                             *");
			System.out.println("***************************************************************");
			System.out.println("*                                                             *");
			System.out.println("*                    1 - CRIAR PRODUTO                        *");
			System.out.println("*                    2 - ESTOQUE DISPONÍVEL                   *");
			System.out.println("*                    3 - BUSCAR POR CATEGORIA                 *");
			System.out.println("*                    4 - ATUALIZAR PRODUTO                    *");
			System.out.println("*                    5 - DELETAR PRODUTO                      *");
			System.out.println("*                    6 - SAIR                                 *");
			System.out.println("*                                                             *");
			System.out.println("***************************************************************");
			System.out.println("DIGITE A OPÇÃO DESEJADA:                                       ");
			opcao = input.nextInt();

			if (opcao == 6) {
				System.out.println("\nObrigado por visitar o Cantinho das Bebidas!");
				input.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Criar um Produto:\n\n");

				System.out.println("Digite o ID do Produto: ");
				id = input.nextInt();
				System.out.println("Digite o Nome do Produto: ");
				input.skip("\\R?");
				produto = input.nextLine();

				do {
					System.out
							.println("Digite a Categoria do Produto: (1 = Cerveja, 2 = Vinho, 3 = Whisky, 4 = Vodka):");
					categoria = input.nextInt();

				} while (categoria < 1 || categoria > 4);
				System.out.println("Digite a Quantidade de Itens: ");
				quantidade = input.nextInt();

				break;

			case 2:
				System.out.println("Estoque Disponível:\n\n ");
				break;

			case 3:
				System.out.println("Buscar Por Categoria:\n\n");
				break;

			case 4:
				System.out.println("Atualizar Produto:\n\n");
				break;

			case 5:
				System.out.println("Deleter Produto:\n\n");
				break;

			default:
				System.out.println("Opção Inválida!\n");
				break;

			}

		}

	}

}
