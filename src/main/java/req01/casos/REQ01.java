package req01.casos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class REQ01 {
	
	private List<Livro> listaLivros = new ArrayList();
	
	public Livro cadastrarLivro(Livro livro) {
		if(livro.getIsbn().isEmpty() || livro.getTitulo().isEmpty() || livro.getAutor().isEmpty()) {
			throw new LivroInvalido("Livro inválido.");
		}

		for(Livro l : listaLivros) {
			if(l.getIsbn().equals(livro.getIsbn())) {
				throw new LivroJaCadastradoException("Não é possível adicionar pois ISBN já existe.");
			}
		}
		listaLivros.add(livro);
		return livro;
		
	}
	

}
