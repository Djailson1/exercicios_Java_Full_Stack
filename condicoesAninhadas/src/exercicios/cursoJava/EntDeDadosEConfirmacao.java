package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class EntDeDadosEConfirmacao {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");//insere dados do usuário por janela do sistema
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");

		double numCarros = Double.parseDouble(carros); //passa String texto para double valor em números 
		double numPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numCarros / numPessoas); //divisão de carro por pessoas e conversão de DOuble para inteiro para não aparecer número quebrado

		double resto = numCarros % numPessoas; //o resto da divisão ou seja o q sobra



		int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divisão? "); //caixa de diálogo de confirmação sim/não/cancelar para números inteiros

		if(resposta == 0){ //zero pq na documentação é igual a sim daí ele irá imprimir o resultado imprime a divisão 
		  JOptionPane.showMessageDialog(null,"divisão para pessoas deu: " + divisao + " carros para cada pessoa.");
		}else{//para caso for não irá imprimir isso:
		  System.out.println("não quis ver o resultado ");
		}

		resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resto da divisão? ");

		if(resposta == 0){//zero pq na documentação é igual a sim daí ele irá imprimir o resultado imprime o resto da divisão 
		  JOptionPane.showMessageDialog(null,"O resto da divisão é " + resto);
		}else{//para caso for não irá imprimir isso:
		  System.out.println("não quis ver o resultado ");
		}
	}

}
