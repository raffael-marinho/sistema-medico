package programa.app;

public class Aplicacao {

	public static void main(String[] args) {
        Paciente p1 = new Paciente("123.456.789-00", "João Silva", 75.5f, 1.78f, 29, 'M');
		
		System.out.println(p1);
        System.out.println("IMC: " + p1.calcularImc());
        System.out.println("Metabolismo Basal: " + p1.calcularMetabolismoBasal());

	}

}
