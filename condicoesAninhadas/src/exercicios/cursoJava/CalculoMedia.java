package exercicios.cursoJava;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");
		// pedindo as notas ao usu�rio e armazenando na vari�vel

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		// convertendo string texto em double num�ros quebrados

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		// calculando m�dia

		// m�dia para aprova��o � 70

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno est� aprovado com a m�dia de:  " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno est� em recupera��o com a m�dia de:  " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno est� em reprovado com a m�dia de:  " + media);
		}

	}

}
