
public class AlugarLivro {
	public static void main(String[] args) {
		Livro l1, l2, l3, l4, l5;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();
		l5 = new Livro();
		
		l1.setTitulo("Pequena Sereia");
		l1.setAutor("Hans Christian Andersen");
		l1.setAnoPub(1978);
		l1.setCategoria("Infantil");
		l1.setNumEstante(5);
		l1.setNumPrateleira(1);
		l1.emprestar();
		
		l2.setTitulo("Armada");
		l2.setAutor("Ernest Cline");
		l2.setAnoPub(2015);
		l2.setCategoria("Ficcao");
		l2.setNumEstante(1);
		l2.setNumPrateleira(2);
		l2.emprestar();
		
		l3.setTitulo("Jogador numero um");
		l3.setAutor("Ernest Cline");
		l3.setAnoPub(2016);
		l3.setCategoria("Ficcao");
		l3.setNumEstante(1);
		l3.setNumPrateleira(3);
		l3.emprestar();
		
		l4.setTitulo("Uma noite de verao");
		l4.setAutor("Clarice Silva");
		l4.setAnoPub(2019);
		l4.setCategoria("Romance");
		l4.setNumEstante(2);
		l4.setNumPrateleira(5);
		l4.devolver();
		
		l5.setTitulo("Jumanji");
		l5.setAutor("Gabriel Rodrigues");
		l5.setAnoPub(2000);
		l5.setCategoria("Aventura");
		l5.setNumEstante(3);
		l5.setNumPrateleira(3);
		l5.devolver();
		
		l1.exibirLivro();
		l2.exibirLivro();
		l3.exibirLivro();
		l4.exibirLivro();
		l5.exibirLivro();
		
	}

}
