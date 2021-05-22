package req01.casos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class REQ01 {
	
	private List<Livro> listaLivros = new ArrayList();
	
	public Livro cadastrarLivro(Livro livro) {
		for(Livro l : listaLivros) {
			if(l.getIsbn().equals(livro.getIsbn())) {
				throw new LivroJaCadastradoException("N�o � poss�vel adicionar pois ISBN j� existe.");
			}
		}
		listaLivros.add(livro);
		return livro;
		
	}
	

}
