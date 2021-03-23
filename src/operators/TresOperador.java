package operators;

import java.text.DecimalFormat;
//import java.text.Format;
import java.text.NumberFormat;

public class TresOperador {
	public String nome;
	public double preco;
	public int quantidade;
	public double peso;
	
	NumberFormat formato = new DecimalFormat("R$##.00");
	NumberFormat media = new DecimalFormat("Kg0.000#");
	
	public TresOperador(String nome, double preco, int quantidade, double peso) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.peso = peso;
	}
	
	public double vlrEstq() {
		return preco * peso;
	}

	public void addQtd(int quantity) {
		this.quantidade += quantity;
	}
	
	public void remQtd(int quantity) {
		this.quantidade -= quantity;
	}
	
	public double mdEstq() {
		return peso/quantidade;
	}
	public String toString() {
		return "\nNome: "
			   +nome
			   +"\nPreço: "
			   +formato.format(preco)
			   +"\nQuantidade: "
			   +quantidade
			   +"peso: "
			   +media.format(peso)
			   +"\nValor em estoque: R$"
			   +formato.format(vlrEstq())
			   +"\nMedia de peso por peça: "
			   +media.format(mdEstq());
				
	}
	
}
