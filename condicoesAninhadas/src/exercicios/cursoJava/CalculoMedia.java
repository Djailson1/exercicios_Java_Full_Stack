package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");
		// pedindo as notas ao usuário e armazenando na variável

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		// convertendo string texto em double numéros quebrados

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		// calculando média

		// média para aprovação é 70

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com a média de:  " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno está em recuperação com a média de:  " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está em reprovado com a média de:  " + media);
		}

	}

}
