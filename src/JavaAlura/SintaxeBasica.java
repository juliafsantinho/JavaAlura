package JavaAlura;

public class SintaxeBasica {

	public static void main(String[]args) {
		
		System.out.println("Imprimindo uma string no console");
		
			/*abaixo estamos imprimindo uma string no console*/
			System.out.println("ola novo teste");
			
		System.out.println("Variavel n� inteiro");
		
			/*abaixo estamos declarando uma variavel de um numero inteiro*/
			int idade;
			idade = 26;
			System.out.println(idade);
			idade = 10 + 26;
			System.out.println(idade);
			idade = 20 + (30 * 10);
			
			/*abaixo estamos imprimindo no console uma strig e uma variavel , para isso utilizamos o + */
			System.out.println("a idade �"+ idade);
			
			/*abaixo declaramos uma variavel de um numero real*/
		System.out.println("Variavel n� real");
		
			double salario;
			salario = 125.33;
			System.out.println(salario);
			
			/*abaixo eu estou falando para quando receber salario transformar esta variavel em um numero inteiro, se eu n�o colocar isso da erro
			 * */
				
	
			System.out.println("Variavel n� caracteres Unicode");
			
			/*imprime uma letra, ou se pode colocar numeros que s�o referentes a UTF8 que ela imprimir� o caracter correspondente ao n*da tabela*/
			
			char letra = 66;
			System.out.println(letra);
			String palavra = "ola,tudo certo?";
			System.out.println(palavra);
		
		System.out.println("condicionais if and else");
			int idadeIf = 16;
			if(idadeIf >= 18) {
				System.out.println("voc� tem mais de 18 anos, seja Bem Vinde");
			}else {
				System.out.println("voc� n�o pode entrar!");
			}
			
		System.out.println("Bollean condicionais");
			boolean acompanhado = true;
			if(idadeIf >= 18 || acompanhado) {
				System.out.println("voc� tem mais de 18 anos, ou esta acompanhado , seja bem vinde!");
			}else {
				System.out.println("voc� n�o pode entrar!");
			}			
		
		System.out.println("Escopo e inicializa��o de vari�veis");
		
			/*n�o existe valor fixo quando eu n�o declaro oque a variavel recebe e a variavel declarada dentro do{} s� existe dentro do bigode*/
			boolean verdadeiroOuFalso;
			
			if(acompanhado = true) {
				verdadeiroOuFalso = true;
			}else {
				verdadeiroOuFalso = false;
			}
			
			System.out.println(verdadeiroOuFalso);
		
		System.out.println("switch-varias op��es de if ");
			
	         int mes = 10;

		        switch (mes) {
		            case 1:
		                System.out.println("O m�s � Janeiro");
		                break;
		            case 2:
		                System.out.println("O m�s � Fevereiro");
		                break;
		            case 3:
		                System.out.println("O m�s � Mar�o");
		                break;
		            case 4:
		                System.out.println("O m�s � Abril");
		                break;
		            case 5:
		                System.out.println("O m�s � Maio");
		                break;
		            case 6:
		                System.out.println("O m�s � Junho");
		                break;
		            case 7:
		                System.out.println("O m�s � Julho");
		                break;
		            case 8:
		                System.out.println("O m�s � Agosto");
		                break;
		            case 9:
		                System.out.println("O m�s � Setembro");
		                break;
		            case 10:
		                System.out.println("O m�s � Outubro");
		                break;
		            case 11:
		                System.out.println("O m�s � Novembro");
		                break;
		            case 12:
		                System.out.println("O m�s � Dezembro");
		                break;
		            default:
		                System.out.println("M�s inv�lido");
		                break;
		        }
		    
		   System.out.println(" la�os de repe��o while");
		   		int contador = 0;
		   		while(contador <= 10) {
		   			System.out.println(contador);
		   			contador++;
		   		}
		   System.out.println(" la�os de repe��o for");
			   	for(int i = 0;i <= 10;i++) {
			   			System.out.println(i);
			   		}
		        
    }

}
