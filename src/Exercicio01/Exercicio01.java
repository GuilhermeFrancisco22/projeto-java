package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Estoque pdtEstoque;
		pdtEstoque = new Estoque();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome do Produto:");
		pdtEstoque.prduto = scanner.nextLine();
		System.out.println("Informe o Preço:");
		pdtEstoque.preco = scanner.nextDouble();
		System.out.println("Informe a quantidade em estoque:");
		pdtEstoque.qtdEstoque = scanner.nextDouble();
		double valorTotal = pdtEstoque.valorTotal();
		double addEstoque = pdtEstoque.addEstoque();

		System.out.printf("Nome: %s%nPreço: %.2f%nQuantidade Estoque: %.0f%nPreço Total: %.2f%n", pdtEstoque.prduto,
				pdtEstoque.preco, pdtEstoque.qtdEstoque, valorTotal);

		System.out.println("Adicionar ou Remover do Estoque:");
		addEstoque = scanner.nextDouble();

		System.out.printf(
				"Nome: %s%nPreço: %.2f%nQuantidade Estoque: %.0f%nPreço Total: %.2f%nQuantidade removida ou adicionada:",
				pdtEstoque.prduto, pdtEstoque.preco, pdtEstoque.qtdEstoque, valorTotal, addEstoque);
	}

}
