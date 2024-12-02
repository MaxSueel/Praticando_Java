
public class App {

	public static void main(String[] args) {
		
		Personagem heroi = new Personagem();
		
		heroi.nome = "Max Sueel";
		heroi.nivel = 2;
		heroi.forca = 16;
		
		heroi.mostrarStatus();
		System.out.println();
		heroi.atacar("Hydra", "duplo pulo");
		
		System.out.println();
		
		System.out.println(heroi.calcularDano());

		
		
				

	}

}
