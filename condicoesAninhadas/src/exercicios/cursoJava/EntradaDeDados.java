package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");//insere dados do usu�rio por janela do sistema
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");

		double numCarros = Double.parseDouble(carros); //passa String texto para double valor em n�meros 
		double numPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numCarros / numPessoas); //divis�o de carro por pessoas e convers�o de DOuble para inteiro para n�o aparecer n�mero quebrado

		double resto = numCarros % numPessoas; //o resto da divis�o ou seja o q sobra

		JOptionPane.showMessageDialog(null,"divis�o para pessoas deu: " + divisao + " carros e sobrou " + resto + " carros"); //imprimindo em caixa de di�logo do sisyema


		System.out.println(carros);
	}

}
