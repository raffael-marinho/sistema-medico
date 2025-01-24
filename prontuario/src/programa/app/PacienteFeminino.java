package programa.app;

public class PacienteFeminino extends Paciente {

	public PacienteFeminino(String cpf, String nome, float peso, float altura, int idade) {
		super(cpf, nome, peso, altura, idade);
		// TODO Auto-generated constructor stub
	}

	public float calcularMetabolismoBasal() {
		if (idade > 18 && idade < 30)
			return (14.7f * peso) + 486.6f;
		else if (idade >= 30 && idade < 60)
			return (8.7f * peso) + 829f;
		else
			return (10.5f * peso) + 596f;
	}
}
