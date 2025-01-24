package programa.app;

import java.util.Objects;

public abstract class Paciente {

	String cpf;
	String nome;
	float peso;
	float altura;
	int idade;

	static int CONTADOR = 0;

	public Paciente(String cpf, String nome, float peso, float altura, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		Paciente.CONTADOR++;
	}

	public float calcularImc() {
		return peso / (altura * altura);
	}

	public abstract float calcularMetabolismoBasal();

	@Override
	public String toString() {
		return "Paciente [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade=" + idade
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public static int getCONTADOR() {
		return CONTADOR;
	}

	public static void setCONTADOR(int cONTADOR) {
		CONTADOR = cONTADOR;
	}
}
