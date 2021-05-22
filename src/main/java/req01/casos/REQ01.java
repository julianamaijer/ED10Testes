package req01.casos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class REQ01 {
	
	private List<Livro> listaLivros = new ArrayList();
	
	public Livro cadastrarLivro(Livro livro) {
		if(livro.getIsbn().isEmpty()) {
			throw new LivroInvalido("Livro com isbn em branco.");
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
