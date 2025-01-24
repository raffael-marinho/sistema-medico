package programa.app;

import java.time.LocalDateTime;
import java.util.Objects;

public class PacienteMasculino implements IPaciente{

	String cpf;
	String nome;
	float peso;
	float altura;
	int idade;
	LocalDateTime dataAndropausa;
	
	
	public PacienteMasculino(String cpf, String nome, float peso, float altura, int idade,
			LocalDateTime dataAndropausa) {
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.dataAndropausa = dataAndropausa;
	}


	@Override
	public float calcularMetabolismoBasal() {
		if(idade > 18 && idade < 30)
			return (15.057f*peso)+679f;
		else if(idade >= 30 && idade < 60)
			return (11.6f*peso)+879f;
		else
			return (13.5f*peso)+487f;
		
	}
	
	public float calcularImc() {
		return peso/(altura*altura);
	}


	@Override
	public String toString() {
		return "PacienteMasculino [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade="
				+ idade + ", dataAndropausa=" + dataAndropausa + "]";
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


	public LocalDateTime getDataAndropausa() {
		return dataAndropausa;
	}


	public void setDataAndropausa(LocalDateTime dataAndropausa) {
		this.dataAndropausa = dataAndropausa;
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
		PacienteMasculino other = (PacienteMasculino) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	
	
	
	
	
	

	

	
	
	
}
