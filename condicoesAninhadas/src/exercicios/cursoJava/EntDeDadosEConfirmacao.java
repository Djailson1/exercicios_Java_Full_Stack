package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class EntDeDadosEConfirmacao {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");//insere dados do usu�rio por janela do sistema
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");

		double numCarros = Double.parseDouble(carros); //passa String texto para double valor em n�meros 
		double numPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numCarros / numPessoas); //divis�o de carro por pessoas e convers�o de DOuble para inteiro para n�o aparecer n�mero quebrado

		double resto = numCarros % numPessoas; //o resto da divis�o ou seja o q sobra



		int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divis�o? "); //caixa de di�logo de confirma��o sim/n�o/cancelar para n�meros inteiros

		if(resposta == 0){ //zero pq na documenta��o � igual a sim da� ele ir� imprimir o resultado imprime a divis�o 
		  JOptionPane.showMessageDialog(null,"divis�o para pessoas deu: " + divisao + " carros para cada pessoa.");
		}else{//para caso for n�o ir� imprimir isso:
		  System.out.println("n�o quis ver o resultado ");
		}

		resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resto da divis�o? ");

		if(resposta == 0){//zero pq na documenta��o � igual a sim da� ele ir� imprimir o resultado imprime o resto da divis�o 
		  JOptionPane.showMessageDialog(null,"O resto da divis�o � " + resto);
		}else{//para caso for n�o ir� imprimir isso:
		  System.out.println("n�o quis ver o resultado ");
		}
	}

}
