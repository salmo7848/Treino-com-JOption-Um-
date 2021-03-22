package operators;

import java.text.DecimalFormat;
//import java.text.Format;
import java.text.NumberFormat;

public class TresOperador {
	public String nome;
	public double preco;
	public int quantidade;
	
	NumberFormat formato = new DecimalFormat("R$##.00");
	
	public TresOperador(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double vlrEstq() {
		return preco *quantidade;
	}

	public void addQtd(int quantity) {
		this.quantidade += quantity;
	}
	
	public void remQtd(int quantity) {
		this.quantidade -= quantity;
	}
	
	public String toString() {
		return "\nNome: "
			   +nome
			   +"\nPreço: "
			   +formato.format(preco)
			   +"\nQuantidade: "
			   +quantidade
			   +"\nValor em estoque: R$"
			   +formato.format(vlrEstq());
				
	}
	
}
