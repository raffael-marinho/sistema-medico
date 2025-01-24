package programa.app;

public class PacienteMasculino extends Paciente {

	public PacienteMasculino(String cpf, String nome, float peso, float altura, int idade) {
		super(cpf, nome, peso, altura, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularMetabolismoBasal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
