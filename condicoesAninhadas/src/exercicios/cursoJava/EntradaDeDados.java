package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");//insere dados do usuário por janela do sistema
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");

		double numCarros = Double.parseDouble(carros); //passa String texto para double valor em números 
		double numPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numCarros / numPessoas); //divisão de carro por pessoas e conversão de DOuble para inteiro para não aparecer número quebrado

		double resto = numCarros % numPessoas; //o resto da divisão ou seja o q sobra

		JOptionPane.showMessageDialog(null,"divisão para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros"); //imprimindo em caixa de diálogo do sisyema


		System.out.println(carros);
	}

}
