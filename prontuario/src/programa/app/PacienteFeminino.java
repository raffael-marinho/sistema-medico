package programa.app;

import java.time.LocalDateTime;

public class PacienteFeminino extends Paciente {

	LocalDateTime dataMenarca;
	LocalDateTime dataMenopausa;

	public PacienteFeminino(String cpf, String nome, float peso, float altura, int idade, LocalDateTime menarca,
			LocalDateTime menopausa) {
		super(cpf, nome, peso, altura, idade);
		
		this.dataMenarca = menarca;
		this.dataMenopausa = menopausa;
	}

	public float calcularMetabolismoBasal() {
		if (idade > 18 && idade < 30)
			return (14.7f * peso) + 486.6f;
		else if (idade >= 30 && idade < 60)
			return (8.7f * peso) + 829f;
		else
			return (10.5f * peso) + 596f;
	}

	@Override
	public String toString() {
		return "PacienteFeminino [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade="
				+ idade + ", dataMenarca=" + dataMenarca + ", dataMenopausa=" + dataMenopausa + "]";
	}
	
}
