
public class Livro {
	private String titulo;
	private String autor;
	private int anoPub;
	private String categoria;
	private int numEstante;
	private int numPrateleira;
	private boolean status;
	
	public void emprestar() {
		status = true;
	}
	public void devolver() {
		status = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPub() {
		return anoPub;
	}
	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	public int getNumPrateleira() {
		return numPrateleira;
	}
	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
	void exibirLivro() {
		System.out.println("Informacoes do Livro");
		System.out.println("--------------------------");
		System.out.println("Titulo do Livro: " + titulo);
		System.out.println("Autor do Livro: " + autor);
		System.out.println("Ano do Livro: " + anoPub);
		System.out.println("Categoria: " + categoria);
		System.out.println("Numero da Estante: " + numEstante);
		System.out.println("Nuemero da Prateleira: " + numPrateleira);
		if (status) {
			System.out.println("Livro Emprestado");
		}
		else {
			System.out.println("Livro disponivel");
		}
		System.out.println("--------------------------");

	}
	
}
