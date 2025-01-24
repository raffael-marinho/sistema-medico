package programa.app;

public class Paciente {

	String cpf;
	String nome;
	float peso;
	float altura;
	int idade;
	char sexo;

	public Paciente(String cpf, String nome, float peso, float altura, int idade, char sexo) {
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.sexo = sexo;
	}

	public float calcularImc() {
		return peso / (altura * altura);
	}

	public float calcularMetabolismoBasal() {
		if (sexo == 'M') {
			if (idade > 18 && idade < 30)
				return (15.057f * peso) + 679f;
			else if (idade >= 30 && idade < 60)
				return (11.6f * peso) + 879f;
			else
				return (13.5f * peso) + 487f;
		} else if (sexo == 'F') {
			if (idade > 18 && idade < 30)
				return (14.7f * peso) + 486.6f;
			else if (idade >= 30 && idade < 60)
				return (8.7f * peso) + 829f;
			else
				return (10.5f * peso) + 596f;
		}
		return 0f;
	}

}
