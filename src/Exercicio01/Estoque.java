package Exercicio01;

public class Estoque {
	public String prduto;
	public double preco;
	public double qtdEstoque;
	public double addEstoque;
	
	public double valorTotal() {
		double total = preco * qtdEstoque;
		return total;
	}
	public double addEstoque() {
		double novoEstoque = qtdEstoque - addEstoque;
		return novoEstoque;
	}
}
