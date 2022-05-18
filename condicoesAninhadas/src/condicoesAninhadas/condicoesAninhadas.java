package condicoesAninhadas;

public class condicoesAninhadas {
	public static void main(String[] args) {
		int nota1 = 10;
		int nota2 = 10;
		int nota3 = 10;
		int nota4 = 90;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*operações logicas condicionais aninhadas*/
		
		if(media >= 50){
			  if(media >= 70){
			   if(media > 90){
			     System.out.println(" Sua média foi: " + media + ". Você foi aprovadissimo");
			   }else{
			    System.out.println(" Sua média foi: " + media + ". Você foi aprovado");
			  }}else{
			    System.out.println(" Sua média foi: " + media + ". Você está de recuperação");
			  }}else{
			    System.out.println(" Sua média foi: " + media + ". Você foi reprovado");
			  }
		
		
	}

}
