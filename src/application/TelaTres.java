package application;

import java.util.Scanner;
import javax.swing.JOptionPane;
/*import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;*/

import operators.TresOperador;

public class TelaTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Dados do produto");
		
		String resp="";
		while(!resp.equals("N") && !resp.equals("n")){
		String nome = JOptionPane.showInputDialog("Produto");
		
		
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		
		TresOperador dados = new TresOperador(nome,preco,quantidade);
		
		
		JOptionPane.showMessageDialog(null, dados);
		
		
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a remover: "));
		dados.remQtd(quantidade);
		
		JOptionPane.showMessageDialog(null,dados);	
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a adicionar: "));
		dados.addQtd(quantidade);
		
		
		JOptionPane.showMessageDialog(null,dados);
		
		resp = JOptionPane.showInputDialog("Deseja continuar? S/N");
			}
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar nosso serviços!");
		
		
		
		
		sc.close();

	}

}
