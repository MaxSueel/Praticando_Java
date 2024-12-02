import java.util.Random;

public class Personagem {
	
	String nome;
	int nivel;
	int forca;
	
	
	// void --> significa que não está retornando nenhum valor 
	public void mostrarStatus() {		
		
		//"Personagem: <nome> (lvl <nivel> ) forca <forca>"
		System.out.printf("Personagem: %s (lvl %d) com %d de força.",  nome, nivel, forca);
		// %d inteiro, %s String, %f flolt
			
	}
	
	int calcularDano() {
		Random gerador = new Random();
		//1... ate 20
		// nextInt(): 0...19 receber o numero inteiro
		//
		
		int dado20Faces = 1 + gerador.nextInt(19);	
		int dano = forca + dado20Faces;
		
		return dano;
		
	}
	
	public void atacar(String alvo, String habilidade) {
		
		int danoCausado = 0;
	
		// o tamanho .length é igual a 0
		if (habilidade.length() == 0) {
			System.out.printf( "%s atacou %s e causou %d de dano. %n", nome, alvo, forca );
		} else {
			System.out.printf( "%s usou '%s'contra %se causou %d de dano. %n", nome, habilidade, alvo,forca);
			
		}
		
		
		
		
		
		
	}		
	

}
