package lpa_Aula_23;

public class ClassePrincipal2 {

	public static void main(String[] args) {
		ContaBancaria contabancaria = new ContaBancaria("USP", 23);
		Cliente cliente = new Cliente("Joao");
		System.out.println("cliente: " + cliente.getNome()
		+ "\ncontabancaria: " + contabancaria.getNumero());
	}
}