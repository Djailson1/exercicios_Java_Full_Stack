package condicoesAninhadas;

public class condicoesAninhadas {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 90;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*opera��es logicas condicionais aninhadas*/
		
		if(media >= 50){
			  if(media >= 70){
			   if(media > 90){
			     System.out.println(" Sua m�dia foi: " + media + ". Voc� foi aprovadissimo");
			   }else{
			    System.out.println(" Sua m�dia foi: " + media + ". Voc� foi aprovado");
			  }}else{
			    System.out.println(" Sua m�dia foi: " + media + ". Voc� est� de recupera��o");
			  }}else{
			    System.out.println(" Sua m�dia foi: " + media + ". Voc� foi reprovado");
			  }
		
		
	}

}
