package lpa_Aula_23;

public class Moto extends Brinquedo {
	public Moto(String cor, String tipo, int velocidade, String nome) {
		super(cor, tipo, velocidade, nome);
	}
	
	public void mover() {
		System.out.println("a moto esta se movendo");
	}
}