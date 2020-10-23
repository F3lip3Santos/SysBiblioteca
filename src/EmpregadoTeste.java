
public class EmpregadoTeste {
	public static void main(String[] args) {

		Empregado ep1, ep2;

		ep1 = new Empregado();
		ep2 = new Empregado();

		ep1.setCargo("Atendente");
		ep1.setNome("Marcos");
		ep1.setSalario(1000);

		ep2.setCargo("Supervisora");
		ep2.setNome("Juliana");
		ep2.setSalario(1500);

		ep1.imprimir();
		ep2.imprimir();

		ep1.aumentarSalario(10);
		ep1.imprimir();

	}

}
