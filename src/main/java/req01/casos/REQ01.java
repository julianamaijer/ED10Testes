package req01.casos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class REQ01 {
	
	private List<Livro> listaLivros = new ArrayList();
	
	public Livro cadastrarLivro(Livro livro) {

		listaLivros.add(livro);

		return livro;
		
	}
	

}
