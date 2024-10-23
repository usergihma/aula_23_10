package lpa_Aula_23;

public class Navio extends Brinquedo {
	public Navio(String cor, String tipo, int velocidade, String nome) {
		super(cor, tipo, velocidade, nome);
	}
	
	public void mover() {
		System.out.println("o navio esta se movendo");
	}
}
