
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;

	void imprimir() {
		System.out.println("Informacoes do Empregado");
		System.out.println("-----------------------------");
		System.out.println("Nome do empregado: " + nome);
		System.out.println("Cargo do empregado: " + cargo);
		System.out.println("Salario do empregado: " + salario);
		System.out.println("-----------------------------");
	}

	void aumentarSalario(double porcentagem) {
		double novoSalario;

		System.out.println("O salario é: " + salario);
		novoSalario = salario + (salario * porcentagem) / 100;
		System.out.println("O novo salario é: " + novoSalario);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
