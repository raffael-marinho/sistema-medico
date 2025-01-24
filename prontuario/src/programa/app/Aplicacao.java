package programa.app;

import java.time.LocalDateTime;

public class Aplicacao {

	public static void main(String[] args) {
		Paciente p1 = new PacienteFeminino("000", "Maria", 60f, 1.6f, 30, LocalDateTime.now(), null);

		IPaciente p2 = new PacienteMasculino("001", "Jose", 60f, 1.6f, 30, LocalDateTime.now());

		System.out.println(p1.calcularImc());
		System.out.println(p2.calcularImc());

		System.out.println(p1.calcularMetabolismoBasal());
		System.out.println(p2.calcularMetabolismoBasal());

		System.out.println(p1);
		System.out.println(p2);
	}

}
